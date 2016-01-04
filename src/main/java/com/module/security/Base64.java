package com.module.security;

import java.io.IOException;

import org.junit.Test;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class Base64 {
	/**
	 * jdk实现Base64加密
	 * @throws IOException 
	 */
	@Test
	public void getJDKBase64() throws Exception{
		String src="manxx";
		
		//实现加密
		BASE64Encoder encoder=new BASE64Encoder();
		String encode=encoder.encode(src.getBytes());
		
		//实现解密
		BASE64Decoder decoder=new BASE64Decoder();
		String yuan=new String(decoder.decodeBuffer(encode));
		
		System.out.println("encode:"+encode);
		System.out.println("yuan:"+yuan);
	}
	/**
	 * 使用commons 进行base64加密
	 */
	@Test
	public void getCommonsCodesBase64(){
		String src="manxx";
		//加密
		byte[] encodeBytes=org.apache.tomcat.util.codec.binary.Base64.encodeBase64(src.getBytes());
		
		//解密
		byte[] decodeBytes=org.apache.commons.codec.binary.Base64.decodeBase64(encodeBytes);
		
		System.out.println("encode:"+new String(encodeBytes));
		System.out.println("decode:"+new String(decodeBytes));
	}

}
