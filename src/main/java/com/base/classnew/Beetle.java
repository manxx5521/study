package com.base.classnew;
/**
 * ����������ʵ��1��������
 */
/*
 * 4����ʼ���길�࣬���������ʼ����
 * 	��ʼ����̬���������static Beetle.x2 initialized��
 * 	3��4����ʵ��ִ�о�̬������ʱ�򴥷��ģ�����Beetle b = new Beetle();����������ȥ���������Ҳ�ᴥ��
 */
public class Beetle extends Insect {
	protected int k = printInit("Beetle.k initialized");
	protected static int x2 = printInit("static Beetle.x2 initialized");
	
	/*
	 * 7��ִ���Լ��Ĺ��췽����ִ��Ĭ�ϵ�Beetle();
	 * 	�ڶ��ϴ�����ʵ������ʵ������ռ����㣬�����Ǿ�̬����k,ִ�и�ֵ���k = printInit("Beetle.k initialized");
	 */
	
	
	/*
	 *1��ִ��ס������main������static������
	 *	��ִ�����static������ʱ���������û�г�ʼ������Ҫ���г�ʼ����
	 *2���������ʼ����ʱ������һ��Լ����������ᱣ֤�������static{}����ִ��֮ǰ��û��static����Զ����һ������
	 *	�����static{}�����Ѿ�ִ����ϡ����ԣ���ִ�������֮�󣬻���ִ��3����ĳ�ʼ��
	 */
	public static void main(String[] args) {
		
		/*
		 * 5��ʵ����Beetle��
		 * 	���๹��ʱ���Զ����ø��๹��
		 */
		Beetle b = new Beetle();
	}
}