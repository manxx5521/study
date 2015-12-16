package com.util;

public class SQLUtil {
	/**
	 * ���������--���ڱ�������
	 * @param size SQL�����д�С
	 * @return String SQL�ַ���
	 * */
	public static String printSql(Integer size){
		String str="SELECT ";
		for(int i=0;i<size;i++){
			int temp=i+1;
			if(temp!=size){
				str=str+temp+" n"+temp+",";
			}else{
				str=str+temp+" n"+temp;
			}
		}
		str=str+" FROM DUAL";
		return str;
	}
	public static void main(String[] args) {
		System.out.print(SQLUtil.printSql(17));
	}

}
