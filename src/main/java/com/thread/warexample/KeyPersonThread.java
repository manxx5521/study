package com.thread.warexample;

public class KeyPersonThread extends Thread {

	@Override
	public void run() {
		System.out.println(getName()+"开始战斗了！");
		for(int i=0;i<10;i++){
			System.out.println(getName()+"左突右杀，攻击隋军...");
		}
		System.out.println(getName()+"结束战斗！");
	}
	
	

}
