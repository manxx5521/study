package com.module.sftp;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.Session;

public class SFTPChannel {
	Session session = null;
	Channel channel = null;

	private static final Logger LOG = Logger.getLogger(SFTPChannel.class.getName());
	
	/**
	 * 使用sftp上传文件<br>
	 * 通过指定的topath传到文件
	 * @param fileName 文件名
	 * @return
	 * @throws Exception
	 */
	public boolean put(String fileName)throws Exception {
		/**
		 * sftp配置文件的内容实例
		 */
		SFTPConstants context =SFTPConstants.getInstance();

		JSch jsch = new JSch(); // 创建JSch对象
		session = jsch.getSession(context.getSftp_username(), context.getSftp_host(),context.getSftp_port()); // 根据用户名，主机ip，端口获取一个Session对象
		LOG.debug("Session created.");
		session.setPassword(context.getSftp_password()); 
		
		Properties config = new Properties();
		config.put("StrictHostKeyChecking", "no");  //此属性设置为no，会将ssh key自动添加到系统路径
		session.setConfig(config); // 为Session对象设置properties
		session.setTimeout(context.getSftp_timeout()); // 设置timeout时间
		session.connect(); // 通过Session建立链接
		LOG.debug("Session connected.");

		LOG.debug("Opening Channel.");
		channel = session.openChannel("sftp"); // 打开SFTP通道
		channel.connect(); // 建立SFTP通道的连接
		LOG.debug("Connected successfully to ftpHost = " + context.getSftp_host()
				+ ",as ftpUserName = " + context.getSftp_username() + ", returning: "
				+ channel);
		//获得ftp实例可以进行实际操作
		ChannelSftp sftp=(ChannelSftp) channel;
		sftp.cd(context.getSftp_toPath());
		String path=context.getSftp_fromParth();
		//获取系统路径分隔符
		String separator=File.separator;
		if(!path.endsWith(separator)){
			path=path+separator;
		}
		//传文件,第一个参数的是取文件的目录，第二个是放到的文件目录
		//（本方法是进入目录后再放，可以直接去给全目录，直接放到目录下）
		sftp.put(new FileInputStream(path+fileName),fileName,ChannelSftp.OVERWRITE);
		//退出
		sftp.quit();
		//关闭资源 
        closeChannel();
		return true;
	}

	public void closeChannel() throws Exception {
		if (channel != null) {
			channel.disconnect();
		}
		if (session != null) {
			session.disconnect();
		}
	}
}