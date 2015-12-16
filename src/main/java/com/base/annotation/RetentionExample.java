package com.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class RetentionExample {
	
	
	/*
	 * ���ã���ʾ��Ҫ��ʲô���𱣴��ע����Ϣ����������ע����������ڣ�������������ע����ʲô��Χ����Ч��
	 
	 ȡֵ��RetentionPoicy���У�

��������1.SOURCE:��Դ�ļ�����Ч����Դ�ļ�������
��������2.CLASS:��class�ļ�����Ч����class������
��������3.RUNTIME:������ʱ��Ч��������ʱ������
	 */
	@Target(ElementType.FIELD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface Column {
	    public String name() default "fieldName";
	    public String setFuncName() default "setField";
	    public String getFuncName() default "getField"; 
	    public boolean defaultDBValue() default false;
	}
	//Columnע��ĵ�RetentionPolicy������ֵ��RUTIME,����ע�⴦��������ͨ�����䣬��ȡ����ע�������ֵ���Ӷ�ȥ��һЩ����ʱ���߼�����
}
