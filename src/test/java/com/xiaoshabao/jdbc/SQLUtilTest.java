package com.xiaoshabao.jdbc;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SQLUtilTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExecuteUpdate() throws Exception {
		SQLUtil sbean = SQLUtil.getInstance();
		String sql = "insert into test1 (sid,name,age) values(null,?,?)";
		String[] params = { "李四", "12" };

		sbean.executeUpdate(sql, params);
	}

	@Test
	public void testExecuteUpdateMoreOne() throws Exception {
		SQLUtil sbean = SQLUtil.getInstance();
		String sql = "insert into test1 (sid,name,age) values(null,?,?)";

		String[] param1 = { "李四3", "15" };
		String[] param2 = { "李四4", "12" };
		String[][] params = { param1, param2 };

		sbean.executeUpdates(sql, params);

	}

	@Test
	public void testExecuteUpdateMore() throws Exception {
		SQLUtil sbean = SQLUtil.getInstance();
		String[] sql = new String[2];
		sql[0] = "insert into test1 (sid,name,age) values(null,?,?)";
		sql[1] = "insert into test1 (sid,name,age) values(null,?,?)";

		String[] param1 = { "李四1", "15" };
		String[] param2 = { "李四2", "12" };
		String[][] params = { param1, param2 };

		sbean.executeUpdates(sql, params);
	}

	@Test
	public void testExecuteQuery() throws Exception {
		String sql = "select * from test1";
		SQLUtil sdao = SQLUtil.getInstance();

		List<Object[]> list=sdao.executeQuery(sql);
		for(Object obj:list){
			obj.toString();
		}
		
		
	}

	@Test
	public void testExecuteQueryParam() {
		fail("Not yet implemented");
	}

}
