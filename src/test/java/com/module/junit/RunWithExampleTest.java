package com.module.junit;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//实现参数化Runner，如果默认的不能是用参数处理
@RunWith(Parameterized.class)
public class RunWithExampleTest {

	private static RunWithExample bean = new RunWithExample();

	private int param1;
	private int param2;

	private int result;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// 在这创建一个参数列表，用来测试
	// 必须在类上声明@RunWith(Parameterized.class)
	@Parameters
	public static Collection<Object[]> data() {

		return Arrays.asList(new Object[][] {

		{ 2, 4, 6 },

		{ 0, 0, 0 },

		{ -3, 9, 6 },

		});

	}

	// 构造函数，对变量进行初始化
	public RunWithExampleTest(int param1, int param2, int result) {

		this.param1 = param1;
		this.param2 = param2;
		this.result = result;

	}

	/**
	 * 进行多参数测试
	 */
	@Test
	public void testGetHe() {
		bean.getHe(param1, param2);
		assertEquals(result, bean.getResult());
	}

}
