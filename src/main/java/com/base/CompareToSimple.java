package com.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ͨ��Comparableʵ��compareTo������������<br>
 * compareTo ����
 * ����0������1����˵����ǰ���ڱȽ���ĺ��
 * С��0������-1����˵����ǰ���ڱȽ����ǰ��
 * �����ڻ�С�ڶ���û�б������𣬷���1�ͷ���100һ����
 */
//Ҫ�������ʵ��Comparable�ӿڣ�Ȼ����дcompareTo()����
public class CompareToSimple implements Comparable<CompareToSimple>{
	private String name;
    private int age;

    public CompareToSimple() {
    }
    public CompareToSimple(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
    /**
     * ���򷽷�
     */
    @Override
    public int compareTo(CompareToSimple o) {
        // �Ȱ�age����
    	
    	//�����ǰ���age���ڱȽϵ�age   12>5
        if (this.age > o.getAge()) {
        	//����15-5=10������һ������0������˵���������ֵ�˳���ڴ���ĺ��
            return (this.age - o.getAge());
        }
        //�����ǰ���ageС�ڱȽϵ�age 6<11
        if (this.age < o.getAge()) {
        	//����6-11=-5������һ��С��0������˵���������ֵ�˳���ڴ����ǰ��
            return (this.age - o.getAge());
        }
        
        // ��������������һ������name����
        /*this.name.compareTo(o.getName())����Ѿ�ʵ�����ַ������ֵ�����
        	��ʵֱ�������С�Ϳ��ԡ����1��-1Ҳ���� */
        if (this.name.compareTo(o.getName()) > 0) {
            return 1;
        }
        if (this.name.compareTo(o.getName()) < 0) {
            return -1;
        }
        
        //˵������һ��
        return 0;
    }
    
    public static void main(String[] args) {

    	CompareToSimple f1 = new CompareToSimple("atony", 11);
    	CompareToSimple f2 = new CompareToSimple("jack", 11);
    	CompareToSimple f3 = new CompareToSimple("tom", 11);
    	CompareToSimple f4 = new CompareToSimple("jason", 44);

        List<CompareToSimple> list = new ArrayList<CompareToSimple>();
        list.add(f1);
        list.add(f3);
        list.add(f4);
        list.add(f2);
        
        //ʵ���б���ֵ�����
        Collections.sort(list);

        for (CompareToSimple o : list) {
            System.out.println(o.getAge() + "-->" + o.getName());
        }
    }
}
