package com.base.classnew;

/**
 * �����ڲ���ͱ����Ĵ���˳��
 */
public class Base {
	private String name = "hello";
	
	//4������Ĺ��췽��
	public Base() {
		callName();  //5��ִ�����callName����
	}
	
	//6��Ӧ��ִ����������������Ϊ������д��������������Ի��������ķ���
	public void callName() {
		System.out.println(name);
	}
	
	//1����ִ�����������,������Ϊ��̬���������Ⱦ�̬�����ĳ�ʼ��������û�о�̬��������ʲô������
	public static void main(String[] args) {
		new Sub();   //2�������������
	}
}

//3����������ʱ���ȵ��ø��๹�������ٵ������๹�췽����
class Sub extends Base {
	private String name = "world";
	
	
	//7�����������������������Ǹ��๹���е��õģ���û�о�������Ĺ��췽�������������е�name����null�����������ʱ������null
	public void callName() {
		System.out.println(name);
	}
}
