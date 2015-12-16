package com.base.map;
/*
ÿ��ѧ�����ж�Ӧ�Ĺ����ء�
ѧ��Student����ַString
ѧ�����ԣ�����������
ע�⣺���������䶼��ͬ����Ϊͬһ��ѧ��
��֤ѧ����Ψһ�ԡ�
1 ����ѧ��
2 ����map��������ѧ����Ϊ������ַ��Ϊֵ����
3 ��ȡmap���ϵ�Ԫ��
*/

//����Ԫ�ر����������ʱ�����
//ʵ��Comparable������compareTo������
public class Student {
	private String name;
	private int age;
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	public int compareTo(Student s)
	{
		int num=new Integer(this.age).compareTo(new Integer(s.age));
		if(num==0)
			return this.name.compareTo(s.name);
		return num;
			
	}
	//Ԫ�����������ϣ��ṹ��Ҫ��֤Ԫ��Ψһ�ԣ�
	//��Ҫ������������hashCode��equals
	public int hashCode()
	{
		return name.hashCode()+age*34;
	}
	public boolean equals(Object obj)
	{
		//�ӽ�ȥ�Ĳ���ѧ��ʱ���Ƚ�������
		//����ֱ�����쳣
		if(!(obj instanceof Student))
			throw new ClassCastException("���Ͳ�ƥ��");
		Student s=(Student)obj;
		return this.name.equals(s.name)&& this.age==s.age;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		return name+":"+age;
	}

}
