package com.thread;

/**
 * ��Ա��<br/>
 * ͨ���̳�Thread���ý���
 */
public class ActorThread extends Thread {

	@Override
	public void run() {
		
		//getName��õ���Thread�ı����߳���
		System.out.println(getName()+"��һ����Ա");
		
		//������¼�ݳ�����
		int count=0;
		boolean keepRunning=true;
		while(keepRunning){
			System.out.println(getName()+"��̨�ݳ���"+(++count));
			if(count==100){
				keepRunning=false;
			}
			
			//û����10�ı���
			if(count%10==0){
				try {
					//˯��1��
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		
		
		System.out.println(getName()+"���ݳ�����");
	}
}
