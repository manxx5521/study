package com.base.factory.methodFactory;

/**
 * ����ģʽ���ȼ�ģʽ�߼�
 * ��Ե���һ����Ʒ�ȼ��ṹ
 */
public class Test {
	
	/*
	 * �����и�������ƣ���Ҫ����pdf��html�Ȳ�ͬ���͵��ļ���
	 * ����ʲô���͵��ļ���Ҫ�����Ƿ���ݲ���������и�ʽ��
	 */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String data = "";
        
        /*
         * ���ݵ����ļ����͵Ĳ�ͬ��html��pdf����������ͬ�Ĺ�����ɫ 
         */
        ExportFactory exportFactory = new ExportHtmlFactory();
        
        
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }

}
