package com.base.factory.abstrFactory;

/**
 * ���󹤳���
 * @author mxv
 *
 */
public interface AbstractFactory {
    /**
     * ����CPU����
     * @return CPU����
     */
    public Cpu createCpu();
    /**
     * �����������
     * @return �������
     */
    public Mainboard createMainboard();
}
