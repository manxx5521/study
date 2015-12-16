package com.module.sftp;

public class Test {
	
	public static void main (String[] args){
		SFTPChannel channel=new SFTPChannel();
		try {
			for(int i=0;i<10;i++){
				channel.put("44704906_12.jpg"); 
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
