package com.thread.warexample;

/**
 * �����߳���<br/>
 * ģ����ս˫������Ϊ
 */
public class ArmyRunnable implements Runnable{

	//volatile��֤���߳̿�����ȷ��ȡ�����߳�д���ֵ
	volatile boolean keepRunning=true;

	@Override
	public void run() {
		while(keepRunning){
			//����5����
			for(int i=0;i<5;i++){
				System.out.println(Thread.currentThread().getName()+"�����Է�["+i+"]");
				
				//ͨ������������ó��˴�����ʱ�䡣���н�����������cpu���´�˭������һ��
				Thread.yield();
			}
		}
		System.out.println(Thread.currentThread().getName()+"����ս����");
	}
	

}
