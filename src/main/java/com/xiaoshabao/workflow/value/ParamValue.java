package com.xiaoshabao.workflow.value;

/**
 * 流程管理相关参数
 */
public class ParamValue {
	
	/**
	 * jdbc数据连接类型
	 * <p>用来选择数据库，可用来在配置文件读取</p>
	 */
	private static DaoType daoType=null;
	
	/**
	 * 获得数据库连接类型
	 * @return
	 */
	public static DaoType getDaoTye() {
		if(daoType==null){
			daoType=DaoType.JDBC;
		}
		return daoType;
	}
	
	

}
