package com.base.factory.methodFactory;

/**
 * ����ĵ���������ɫ<br>
 *	����html����
 */
public class ExportHtmlFactory implements ExportFactory{
	
	/**
	 * ����������ɫ��<br>
	 * ���ݴ����type�ж��Ƿ�Ҫ���ݲ���Ҫ���ʽ��
	 */
    @Override
    public ExportFile factory(String type) {
    	
        if("standard".equals(type)){
            
            return new ExportStandardHtmlFile();
            
        }else if("financial".equals(type)){
            
            return new ExportFinancialHtmlFile();
            
        }else{
            throw new RuntimeException("û���ҵ�����");
        }
    }

}
