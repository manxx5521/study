package com.thread;

public class Test {
	public static void main(String[] args) {
		// �߳�1-->ʹ��actorThread����һ������  
		Thread actorthread = new ActorThread();
		actorthread.setName("Mr Thread");
		actorthread.start();

		// �߳�2-->ActorRunnable��Ҫʱʹ��Thread�Ĺ��췽������������
		Thread actorRunnable = new Thread(new ActorRunnable(),"Ms Runnable");
		actorRunnable.start();
		
		/*
		 * ��ϵͳʵ��������������ʱ��
		 * ���ϴ������߳�1ִ��start������ȴ����߳�ActorThread��run()����ִ�У�ֱ�Ӻ�����߳�2�Ĵ�����
		 * ���ǣ������̶߳���������Ϊ���߳�1��start()����cpu����ִ��1�߳�(ÿһ��cpu����ֻ�ܴ���һ���߳�)
		 * ֻ�е��߳�1ִ�е�sleepʱ��cpu�Ż��пռ䣬Ȼ��ʼִ���߳�2�����߳�sleep��ϵͳ�����²鿴�Ƿ�����Ҫִ�е��߳�
		 */
	}
}
