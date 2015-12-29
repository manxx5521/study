package com.xiaoshabao.workflow.service;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApproverServiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddApprover() {
		ApproverService bean=new ApproverService();
		try {
			bean.addApprover("NMG00002", "2", "00000");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
