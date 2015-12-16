package com.module.sftp;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * ��̬��Ա������
 */
public class SFTPConstants {

	private static SFTPConstants instance = null;

	private String sftp_host = null;
	private int sftp_port = 22;
	private String sftp_username = null;
	private String sftp_password = null;
	private String sftp_fromParth = null;
	private String sftp_toPath = null;
	private int sftp_timeout = 60000;

	/**
	 * ˽�й��췽����������ʼ������
	 * 
	 * @throws IOException
	 */
	private SFTPConstants() throws IOException {
		Properties p = new Properties();
		InputStream in = getClass().getResourceAsStream("sftp.properties");
		p.load(in);
		sftp_host = p.getProperty("host").trim();
		try {
			sftp_port = Integer.parseInt(p.getProperty("port").trim());
		} catch (NumberFormatException e) {
			// ���ת�������쳣�������κβ��� 
		}
		sftp_username = p.getProperty("username").trim();
		sftp_password = p.getProperty("password").trim();
		sftp_fromParth = p.getProperty("fromPath");
		sftp_toPath = p.getProperty("toPath").trim();
		try {
			sftp_timeout = Integer.parseInt(p.getProperty("timeout").trim());
		} catch (NumberFormatException e) {
			// ���ת�������쳣�������κβ��� 
		}
		System.out.println("������ʼ��----------");
	}

	/**
	 * Ψһ���ʵ���ķ���
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
