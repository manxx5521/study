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
	 * ʹ��sftp�ϴ��ļ�<br>
	 * ͨ��ָ����topath�����ļ�
	 * @param fileName �ļ���
	 * @return
	 * @throws Exception
	 */
	public boolean put(String fileName)throws Exception {
		/**
		 * sftp�����ļ�������ʵ��
		 */
		SFTPConstants context =SFTPConstants.getInstance();

		JSch jsch = new JSch(); // ����JSch����
		session = jsch.getSession(context.getSftp_username(), context.getSftp_host(),context.getSftp_port()); // �����û���������ip���˿ڻ�ȡһ��Session����
		LOG.debug("Session created.");
		session.setPassword(context.getSftp_password()); 
		
		Properties config = new Properties();
		config.put("StrictHostKeyChecking", "no");  //����������Ϊno���Ὣssh key�Զ���ӵ�ϵͳ·��
		session.setConfig(config); // ΪSession��������properties
		session.setTimeout(context.getSftp_timeout()); // ����timeoutʱ��
		session.connect(); // ͨ��Session��������
		LOG.debug("Session connected.");

		LOG.debug("Opening Channel.");
		channel = session.openChannel("sftp"); // ��SFTPͨ��
		channel.connect(); // ����SFTPͨ��������
		LOG.debug("Connected successfully to ftpHost = " + context.getSftp_host()
				+ ",as ftpUserName = " + context.getSftp_username() + ", returning: "
				+ channel);
		//���ftpʵ�����Խ���ʵ�ʲ���
		ChannelSftp sftp=(ChannelSftp) channel;
		sftp.cd(context.getSftp_toPath());
		String path=context.getSftp_fromParth();
		//��ȡϵͳ·���ָ���
		String separator=File.separator;
		if(!path.endsWith(separator)){
			path=path+separator;
		}
		//���ļ�,��һ����������ȡ�ļ���Ŀ¼���ڶ����Ƿŵ����ļ�Ŀ¼
		//���������ǽ���Ŀ¼���ٷţ�����ֱ��ȥ��ȫĿ¼��ֱ�ӷŵ�Ŀ¼�£�
		sftp.put(new FileInputStream(path+fileName),fileName,ChannelSftp.OVERWRITE);
		//�˳�
		sftp.quit();
		//�ر���Դ 
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