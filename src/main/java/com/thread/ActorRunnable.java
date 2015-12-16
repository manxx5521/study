package com.thread;

/**
 * ��Ա��<br/>
 * ͨ��ʵ��Runnable�ӿ����õ�����
 */
public class ActorRunnable implements Runnable {

	@Override
	public void run() {
		// getName��õ���Thread�ľ�̬������õ�ǰ�̣߳��ٻ������
		System.out.println(Thread.currentThread().getName() + "��һ����Ա");

		// ������¼�ݳ�����
		int count = 0;
		boolean keepRunning = true;
		while (keepRunning) {
			System.out.println(Thread.currentThread().getName() + "��̨�ݳ���" + (++count));
			if (count == 100) {
				keepRunning = false;
			}

			// û����10�ı���
			if (count % 10 == 0) {
				try {
					// ˯��1��
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println(Thread.currentThread().getName() + "���ݳ�����");

	}

}
