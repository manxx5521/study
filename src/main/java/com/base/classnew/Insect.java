package com.base.classnew;
/**
 * ����������ʵ��1
 */
/*
 *3��������г�ʼ�������γ�ʼ������new��getstatic��putstatic������invokestatic ��4���ֽ��롣
 *	��ʼ����ʱ���������̬����������̬���������������ʱ�����static Insect.x1 initialized�������static{} Ҳ��ִ�С�
 *	3��ִ�о�̬�����ĳ�ʼ��ʱ���ᰴ�Ⱥ�˳�򴴽�
 *	��ʼ����ʱ��ִ�й��췽�������췽����ʵ������ʱ��ִ��
 */
public class Insect {
	private int i = 9;
	protected int j;
	protected static int x1 = printInit("static Insect.x1 initialized");
	
	static{
		System.out.println("222");
	}
	
	/*
	 * 6��ִ�и��๹��
	 */
	Insect() {
		System.out.println("���๹�캯���׶Σ� i = " + i + ", j = " + j);
		j = 39;
	}

	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
}
