package com.thread.warexample;

/**
 * ��̨��
 */
public class StageThread extends Thread {

	@Override
	public void run() {
		try {
			System.out.println("��ӭ�ۿ���������");

			Thread.sleep(5000);

			// �峯����
			ArmyRunnable armyTasksui = new ArmyRunnable();
			// �������
			ArmyRunnable armyTaskfan = new ArmyRunnable();

			// ʹ��runnable�ӿڴ������ӽ���
			Thread armysui = new Thread(armyTasksui, "���");
			Thread armyfan = new Thread(armyTaskfan, "�����");

			// �������̣��þ��ӿ�ʼ��ս
			armysui.start();
			armyfan.start();

			// ��̨�߳����ߣ�ר�Ŀ�������ɱ
			Thread.sleep(50);

			// ����һ���̵߳�join��������������
//			armyfan.join();

			System.out.println("˫����ս��������·ɱ������ҧ��");

			Thread cheng = new KeyPersonThread();
			cheng.setName("��ҧ��");
			System.out.println("��ҧ��ı����ǣ�����ս��");

			// �þ���ֹͣ��ɱ��ֹͣ�߳�
			armyTasksui.keepRunning = false;
			armyTaskfan.keepRunning = false;
			Thread.sleep(2000);

			// ��̨���ؼ�����
			cheng.start();

			// ��̨��ҧ������߳�
			cheng.join();

			System.out.println("����ս�������հ�����ҵ");
			System.out.println("лл�ۿ�");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		new StageThread().start();
	}

}
