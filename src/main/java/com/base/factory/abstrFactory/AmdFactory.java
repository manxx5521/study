package com.base.factory.abstrFactory;

/**
 * ����AMD����Ĺ�����
 */
public class AmdFactory implements AbstractFactory {

    @Override
    public Cpu createCpu() {
        // TODO Auto-generated method stub
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        // TODO Auto-generated method stub
        return new AmdMainboard(938);
    }

}
