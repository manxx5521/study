package com.module.cryptography;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;
import org.junit.Test;

/**
 * 实现消息摘要算法的MD方式
 * <p>主要是MD5，其他还有MD2、MD5</p>
 */
public class MessageMD {
	private String src="manxx";
	/**
	 * 实现jdk的md5算法
	 * @throws NoSuchAlgorithmException
	 */
	@Test
	public void getJDK_MD5() throws NoSuchAlgorithmException{
		
		//jdk提供MD5和MD2实现
		MessageDigest md=MessageDigest.getInstance("MD5");
		byte[] md5Byte=md.digest(src.getBytes());
		//jdk只能转换成byte数组，通过commons的codec转换成字符串
		String md5String=Hex.encodeHexString(md5Byte);
		
		System.out.println("JDK md5加密："+md5String);
	}
	
	/**
	 * 使用commons来进行md5加密
	 */
	@Test
	public void getCommonsMd5(){
		
		String md51=DigestUtils.md5Hex(src.getBytes());
		
		System.out.println("commons md5:"+md51);
	}

}
