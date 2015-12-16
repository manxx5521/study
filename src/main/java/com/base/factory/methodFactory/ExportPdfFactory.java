package com.base.factory.methodFactory;

/**
 * 具体的导出工厂角色<br>
 *	导出pdf数据
 */
public class ExportPdfFactory implements ExportFactory {
	
	/**
	 * 创建导出角色类<br>
	 * 根据传入的type判断是否要根据财务要求格式化
	 */
    @Override
    public ExportFile factory(String type) {
        if("standard".equals(type)){
            
            return new ExportStandardPdfFile();
            
        }else if("financial".equals(type)){
            
            return new ExportFinancialPdfFile();
            
        }else{
            throw new RuntimeException("没有找到对象");
        }
    }

}
