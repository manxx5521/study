package com.module.HttpClient;

import static org.junit.Assert.*;

import org.apache.http.client.methods.HttpGet;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class HttpClientUtilTest {
	
	private HttpClientUtil bean=HttpClientUtil.getInstance();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testDoGetString() {
		bean.doGet("http://www.baidu.com");
		/*
		String s=bean.doGet("http://www.baidu.com");
		System.out.println(s);
		*/
	}

	@Test
	public void testDoGetHttpGet() {
		bean.doGet(new HttpGet("http://www.baidu.com"));
	}

	@Test
	public void testDoGetSSL() {
		bean.doGetSSL("https://www.baidu.com/");
		/*
		String s=bean.doGetSSL("https://www.baidu.com/");
		System.out.println(s);
		*/
	}

	@Test
	public void testDoPostString() {
		
		System.out.println(bean.doPost("http://www.baidu.com/"));
	}

	@Test
	public void testDoPostStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoPostStringMapOfStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoPostStringMapOfStringStringListOfFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoPostHttpPost() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoPostSSLString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoPostSSLStringMapOfStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDoPostSSLHttpPost() {
		fail("Not yet implemented");
	}

}
