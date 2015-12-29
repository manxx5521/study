package com.xiaoshabao.jdbc;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class JDBCConstantsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetInstance() throws Exception {
		int count =10;
		for(int i=0;i<count;i++){
			JDBCConstants constants=JDBCConstants.getInstance();
			System.out.println(constants.getUsername()+"--->"+i);
		}
		
	}

}
