package com.base.factory.methodFactory;

public class ExportFinancialPdfFile implements ExportFile{

    @Override
    public boolean export(String data) {
        // TODO Auto-generated method stub
        /**
         * ҵ���߼�
         */
        System.out.println("���������PDF�ļ�");
        return true;
    }

}