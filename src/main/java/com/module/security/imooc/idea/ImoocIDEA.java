package com.module.security.imooc.idea;


public class ImoocIDEA {
	
	private static String src = "imooc security idea";

	public static void main(String[] args) {
		System.out.println(src);
//		bcIDEA();
	}
	/*
	public static void bcIDEA() {
		try {
			Security.addProvider(new BouncyCastleProvider());
			
			//生成key
			KeyGenerator keyGenerator = KeyGenerator.getInstance("IDEA");
			keyGenerator.init(128);
			SecretKey secretKey = keyGenerator.generateKey();
			byte[] keyBytes = secretKey.getEncoded();
			
			//转换密钥
			Key key = new SecretKeySpec(keyBytes, "IDEA");
			
			//加密
			Cipher cipher = Cipher.getInstance("IDEA/ECB/ISO10126Padding");
			cipher.init(Cipher.ENCRYPT_MODE, key);
			byte[] result = cipher.doFinal(src.getBytes());
			System.out.println("bc idea encrypt : " + Base64.encodeBase64String(result));
			
			//解密
			cipher.init(Cipher.DECRYPT_MODE, key);
			result = cipher.doFinal(result);
			System.out.println("bc idea decrypt : " + new String(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
*/
}
