package com.base;
/**
 * ѭ����ʹ�ã�ê��ʹ��
 */
public class ForTest {

	public void mao() {
		ma: for (int i = 1; i < 8; i++) {
			System.out.println("i:" + i);
			mb: for (int j = 9; j < 12; j++) {
				System.out.println("j:" + j);
				
				if (j == 10) {
					System.out.println("��������ѭ��:" + j);
					continue;
				}
				if (i == 4) {
					System.out.println("����jѭ��:" + j);
					break mb;
				}

				if (i == 6) {
					System.out.println("����iѭ��:" + j);
					break ma;
				}
				System.out.println("����jѭ��:" + j);
			}
			System.out.println("����iѭ��:" + i);
		}
	System.out.println("���в������");
	}

	public static void main(String[] args) {
		ForTest b = new ForTest();
		b.mao();
	}

}
