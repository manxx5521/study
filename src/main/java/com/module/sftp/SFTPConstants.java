package com.module.sftp;

import java.io.InputStream;
import java.util.Properties;

/**
 * 静态成员变量类
 */
public class SFTPConstants {

	private static SFTPConstants instance = null;

	private static String sftp_host = null;
	private static int sftp_port = 22;
	private static String sftp_username = null;
	private static String sftp_password = null;
	private static String sftp_fromParth = null;
	private static String sftp_toPath = null;
	private static int sftp_timeout = 60000;

	/**
	 * 私有构造方法，用来初始化变量
	 * 
	 * @throws Exception
	 */
	private SFTPConstants() throws Exception {
		Properties p = new Properties();
		InputStream in = null;
		try {
			in = getClass().getResourceAsStream("sftp.properties");
			p.load(in);
		} catch (Exception e) {
			e.printStackTrace();
			throw new Exception();
		} finally {
			in.close();
		}
		sftp_host = p.getProperty("host").trim();
		try {
			sftp_port = Integer.parseInt(p.getProperty("port").trim());
		} catch (NumberFormatException e) {
			// 如果转换出现异常，不做任何操作
		}
		sftp_username = p.getProperty("username").trim();
		sftp_password = p.getProperty("password").trim();
		sftp_fromParth = p.getProperty("fromPath");
		sftp_toPath = p.getProperty("toPath").trim();
		try {
			sftp_timeout = Integer.parseInt(p.getProperty("timeout").trim());
		} catch (NumberFormatException e) {
			// 如果转换出现异常，不做任何操作
		}
		System.out.println("变量初始化----------");
	}

	/**
	 * 唯一获得实例的方法
	 * 
	 * @throws Exception
	 */
	public static synchronized SFTPConstants getInstance() throws Exception {
		if (instance == null) {
			instance = new SFTPConstants();
		}
		return instance;
	}

	public String getSftp_host() {
		return sftp_host;
	}

	public int getSftp_port() {
		return sftp_port;
	}

	public String getSftp_username() {
		return sftp_username;
	}

	public String getSftp_password() {
		return sftp_password;
	}

	public String getSftp_fromParth() {
		return sftp_fromParth;
	}

	public String getSftp_toPath() {
		return sftp_toPath;
	}

	public int getSftp_timeout() {
		return sftp_timeout;
	}
}
