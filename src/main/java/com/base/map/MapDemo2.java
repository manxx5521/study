package com.base.map;

import java.util.*;

public class MapDemo2 {
	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<String,String>();
		//���Ԫ��
		map.put("04","zhangsan4");
		map.put("02","zhangsan2");
		map.put("01","zhangsan1");
		map.put("03","zhangsan3");
		//keySet()��ȡmap���ϵ����м�������Set����
		Set<String> keySet=map.keySet();
		//����Set����,�Ϳɻ�ȡ������
		Iterator<String> it=keySet.iterator();
		while(it.hasNext())
		{
			String key=it.next();
			//map���ϵ�get������ȡ����Ӧ��ֵ
			String value=map.get(key);
			System.out.println("key:"+key+",value:"+value);
		}
	}
}
