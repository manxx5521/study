package com.base.factory.simpleFactory;
/*
 * ���ֵ�¼��ʽ�磺������֤������֤��������֤ͨ����ȥ���ݿ�����֤�û���
 * ������֤������Ҫ��΢���������֤�û�����
 * ��ô��Ȼ���������ǽ���һ�����ֵ�¼��ʽ�����õĽӿ�
 */
public interface Login {
	//��¼��֤����
	public boolean verify(String name , String password);
}
