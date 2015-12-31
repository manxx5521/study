package com.module.sftp;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SFTPChannelTest {
	private static SFTPChannel channel=new SFTPChannel();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	/**
	 * 测试发送文件
	 */
	@Test
	public void testPut() {
		try {
			for(int i=0;i<10;i++){
				channel.put("44704906_12.jpg"); 
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
