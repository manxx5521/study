package com.module.mail;

public class Testmail {
	public static void main(String[] args){  
        //�������Ҫ�������ʼ�  
     MailSenderInfo mailInfo = new MailSenderInfo();   
     mailInfo.setMailServerHost("smtp.163.com");   
     mailInfo.setMailServerPort("25");   
     mailInfo.setValidate(true);   
     mailInfo.setUserName("manxx5521@163.com");   
     //163���ڵ�¼Ϊ��Ȩ���룬��Ҫͨ�����������ȡ
     mailInfo.setPassword("uljbpgpjqihneled");//������������   
     mailInfo.setFromAddress("manxx5521@163.com");   
     mailInfo.setToAddress("382752556@qq.com");   
     mailInfo.setSubject("�����������");   
     mailInfo.setContent("������������");   
        //�������Ҫ�������ʼ�  
     SimpleMailSender sms = new SimpleMailSender();
         sms.sendTextMail(mailInfo);//���������ʽ   
         sms.sendHtmlMail(mailInfo);//����html��ʽ  
   }  
}
