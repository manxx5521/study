package com.base.map;

import java.util.*;

public class MapDemo1 {
	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<String,String>();
		//���Ԫ��
		map.put("01","zhangsan1");
		map.put("02","zhangsan2");
		//��ӵļ��ظ�ʱ������Ӧ����ֵ���Ǿ�ֵ��put�������ؾ�ֵ
		System.out.println("put"+map.put("03","zhangsan3"));
		System.out.println("put"+map.put("03","wangwu"));
		//�ж��Ƿ���05��
		System.out.println("containsKey:"+map.containsKey("05"));
		/*Ҳ��ͨ��get�����ķ���ֵ���ж�һ�����Ƿ����
		���ڻ��ȡ����ֵ�������ھͷ���null��
		HashMap֧��null,Hashtable��֧��null��
		*/
		map.put("04",null);
		System.out.println("get:"+map.get("023"));
		//ɾ��02�����������Ӧ��ֵ
		System.out.println("remove:"+map.remove("02"));
		//��ȡmap���������е�ֵ��
		Collection<String> coll=map.values();
		System.out.println(coll);
		System.out.println(map);
	}

}
