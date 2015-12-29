package com.xiaoshabao.workflow.jdbc;

import java.util.ArrayList;

import com.xiaoshabao.jdbc.SQLUtil;

/**
 * jdbc方法的数据连接实现类
 */
public class JDBCDao implements FlowDao{
	
	private SQLUtil sqlUtil=SQLUtil.getInstance();

	@Override
	public void executeUpdate(String sql, String[] parameters) throws Exception {
		sqlUtil.executeUpdate(sql, parameters);
	}

	@Override
	public void executeUpdates(String sql, String[][] parameters)
			throws Exception {
		sqlUtil.executeUpdates(sql, parameters);
	}

	@Override
	public void executeUpdates(String[] sqls, String[][] parameters)
			throws Exception {
		sqlUtil.executeUpdates(sqls, parameters);
	}

	@Override
	public ArrayList<Object[]> executeQuery(String sql) throws Exception {
		return sqlUtil.executeQuery(sql);
	}

	@Override
	public ArrayList<Object[]> executeQuery(String sql, String[] parameters)
			throws Exception {
		return sqlUtil.executeQuery(sql, parameters);
	}
	
	

}
