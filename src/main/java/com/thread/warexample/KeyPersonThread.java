package com.thread.warexample;

public class KeyPersonThread extends Thread {

	@Override
	public void run() {
		System.out.println(getName()+"��ʼս���ˣ�");
		for(int i=0;i<10;i++){
			System.out.println(getName()+"��ͻ��ɱ���������...");
		}
		System.out.println(getName()+"����ս����");
	}
	
	

}
