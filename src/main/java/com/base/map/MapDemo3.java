package com.base.map;

import java.util.*;

public class MapDemo3 {
	public static void main(String[] args) 
	{
		Map<String,String> map=new HashMap<String,String>();
		//���Ԫ��
		map.put("04","zhangsan4");
		map.put("02","zhangsan2");
		map.put("01","zhangsan1");
		map.put("03","zhangsan3");
		//ȡ��ӳ���ϵ������Set����
		Set<Map.Entry<String,String>> entrySet=map.entrySet();
		//��������ȡӳ���ϵ
		Iterator<Map.Entry<String,String>> it=entrySet.iterator();
		while (it.hasNext())
		{
			//Map.Entry�д����ӳ���ϵ
			Map.Entry<String,String> me=it.next();
			//��ȡ����ֵ
			String key = me.getKey();
			String value = me.getValue();
			System.out.println(key+":"+value);
		}	
	}

}
