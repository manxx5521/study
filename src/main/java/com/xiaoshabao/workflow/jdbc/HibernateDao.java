package com.xiaoshabao.workflow.jdbc;

import java.util.ArrayList;

/**
 * Hibernate的数据连接类
 */
public class HibernateDao implements FlowDao{

	@Override
	public void executeUpdate(String sql, String[] parameters) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdates(String sql, String[][] parameters)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeUpdates(String[] sqls, String[][] parameters)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Object[]> executeQuery(String sql) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Object[]> executeQuery(String sql, String[] parameters)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
