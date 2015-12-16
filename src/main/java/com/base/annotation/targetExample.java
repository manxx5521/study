package com.base.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 *	�±ߵ�ע�����Ϊ��������
 */
public class targetExample {
	
	
	/*
	 * ���ã���������ע���ʹ�÷�Χ��������������ע���������ʲô�ط���
	ȡֵ(ElementType)�У�

��������1.CONSTRUCTOR:��������������
��������2.FIELD:����������
��������3.LOCAL_VARIABLE:���������ֲ�����
��������4.METHOD:������������
��������5.PACKAGE:����������
��������6.PARAMETER:������������
��������7.TYPE:���������ࡢ�ӿ�(����ע������) ��enum����
	 */
	@Target(ElementType.TYPE)
	public @interface Table {
	    /**
	     * ���ݱ�����ע�⣬Ĭ��ֵΪ������
	     * @return
	     */
	    public String tableName() default "className";
	}

	@Target(ElementType.FIELD)
	public @interface NoDBColumn {

	}
	
	//ע��Table ��������ע���ࡢ�ӿ�(����ע������) ��enum����,��ע��NoDBColumn��������ע����ĳ�Ա������

}
