package com.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
/**
 * ʱ�乤����
 * @author mxv
 *
 */
public class DateUtil {
	/**
	 * ͨ�������������
	 * */
	public String getYear(){
		//���������
		Calendar cal = Calendar.getInstance();  
		//��ʽ����
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy");
		//ת�����ַ���
		String datetemp=dateformat.format(cal.getTime());
		return datetemp;
	}
	
	/**
	 * ����ʱ���16λ��
	 * @return
	 */
	public String getDateNumber(){
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");//�����ʽ������ʾ����
		Timestamp now = new Timestamp(System.currentTimeMillis());//��ȡϵͳ��ǰʱ��
		return df.format(now);
	}
	
	/**
	 * ���ص�ǰʱ����ַ���
	 * @return
	 */
	public String getDate(){
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMM");  //��ʽ������   yyyy/MM/dd HH:mm:ss
		String currentTime=sdf.format(date);  //�浽�ַ���
		return currentTime;
	}
	
	public static void main(String[] args) {
		DateUtil d=new DateUtil();
		System.out.println(d.getDate());

	}

}
