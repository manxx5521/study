package com.base.factory.methodFactory;

/**
 * ��������<br>
 * ���еľ��幤����ɫ����Ҫʵ������ӿ�
 */
public interface ExportFactory {
	/**
	 * ��������
	 * @param type ����������
	 * @return
	 */
	public ExportFile factory(String type);
}
