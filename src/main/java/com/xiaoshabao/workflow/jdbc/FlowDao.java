package com.xiaoshabao.workflow.jdbc;

import java.util.ArrayList;

/**
 * 流程的数据接口类<br>
 * 可以通过这个接口，实现各种框架数据层方法，来达到同样的效果。<br>
 * 改更少的代码达到相同的效果
 */
public interface FlowDao {
	/**
	 * 添加、更新、删除单条记录
	 * 
	 * @param sql
	 * @param parameters
	 * @throws Exception
	 */
	public void executeUpdate(String sql, String[] parameters) throws Exception;

	/**
	 * 可以执行多个update、delete、insert语句（考虑事务）<br/>
	 * 根据一个更新sql，插入多条记录
	 * 
	 * @param sql
	 *            传入一个sql
	 * @param parameters
	 *            传入多组参数String[][]
	 * @throws Exception
	 */
	public void executeUpdates(String sql, String[][] parameters)
			throws Exception;

	/**
	 * 可以执行多个update、delete、insert语句（考虑事务）<br/>
	 * 两个参数的个数必须一一对应
	 * 
	 * @param sqls
	 *            这个需要传入多个sql[]
	 * @param parameters
	 *            传入多组参数String[][]
	 * @throws Exception
	 */
	public void executeUpdates(String[] sqls, String[][] parameters)
			throws Exception;

	/**
	 * 统一的select语句<br/>
	 * 为了能够访问结果集，将结果集放入ArrayList，这样可以直接关闭资源
	 * 
	 * @param sql
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Object[]> executeQuery(String sql) throws Exception;

	/**
	 * 统一的select语句<br/>
	 * 为了能够访问结果集，将结果集放入ArrayList，这样可以直接关闭资源
	 * 
	 * @param sql
	 * @param parameters
	 * @return
	 * @throws Exception
	 */
	public ArrayList<Object[]> executeQuery(String sql, String[] parameters)
			throws Exception;

}
