package com.base.map;

import java.util.*;

public class MapDemo {
	public static void main(String[] args) 
	{
		HashMap<Student,String> h=new HashMap<Student,String>();
		//���Ԫ�ء�ѧ���Ǽ���������Ϊֵ
		h.put(new Student("zhangsan1",21),"beijing");
		h.put(new Student("zhangsan2",30),"hefei");
		h.put(new Student("zhangsan2",30),"nanjing");
		h.put(new Student("zhangsan3",27),"guangzhou");
		h.put(new Student("zhangsan4",25),"qingdao");
		//��һ��ȡ����ʽ keySet
		//keySet()��ȡmap���ϵ����м�������Set����
		Set<Student> keySet=h.keySet();
		//����Set����,�Ϳɻ�ȡ������
		Iterator<Student> it=keySet.iterator();
		while(it.hasNext())
		{
			Student stu=it.next();
			//map���ϵ�get������ȡ����Ӧ��ֵ
			String adrs=h.get(stu);
			System.out.println(stu+":"+adrs);
		}
		//�ڶ���ȡ����ʽ entrySet
		//ȡ��ӳ���ϵ������Set����
		Set<Map.Entry<Student,String>> entrySet=h.entrySet();
		//��������ȡӳ���ϵ
		Iterator<Map.Entry<Student,String>> it1=entrySet.iterator();
		while (it1.hasNext())
		{
			//Map.Entry�д����ӳ���ϵ
			Map.Entry<Student,String> me=it1.next();
			//��ȡ����ֵ
			Student stu = me.getKey();
			String adrs = me.getValue();
			System.out.println(stu+"....."+adrs);
		}	

	}

}
