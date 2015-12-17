package com.module.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DateUtilExampleTest {

	private static DateUtilExample bean = new DateUtilExample();

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void setDown() throws Exception {
	}

	@Test
	public void testGetYear() {
		bean.getYear();

		// 期待的结果,一样通过
		assertEquals("2015", bean.getYear());
	}

	@Ignore
	// 先忽略这个方法
	@Test
	public void testGetMonth() {
		bean.getMonth();
	}

	// 空方法测试
	@Test(timeout = 5000)
	// 限时测试，超过5s还没有执行结束，算失败
	public void testGetAll() {
		bean.getAll();
	}

	// 如果抛出ArithmeticException这个算数异常才算通过，没有异常算失败
	@Test(expected = ArithmeticException.class)
	public void testGetChu() {
		bean.getChu(2, 0);
	}


}
