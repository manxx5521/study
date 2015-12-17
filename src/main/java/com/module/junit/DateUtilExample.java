package com.module.junit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * 测试工具使用简单使用
 */
public class DateUtilExample {

	/*
	 * 直接在视图上右键 New -> JUnit test case 选择相应的test目录，然后下一不选择方法
	 */

	/**
	 * 这是个正常的方法
	 * */
	public String getYear() {
		// 获得日历类
		Calendar cal = Calendar.getInstance();
		// 格式成年
		SimpleDateFormat dateformat = new SimpleDateFormat("yyyy");
		// 转换成字符串
		String datetemp = dateformat.format(cal.getTime());
		return datetemp;
	}

	/**
	 * 这是个未完成的方法，会使用@Ignore来忽略它
	 */
	public String getMonth() {

		return null;
	}

	/**
	 * 给个死循环
	 */
	public void getAll() {

		// 死循环
		for (;;)
			;
	}

	/**
	 * 除法运算，抛出异常测试
	 * 
	 * @throws Exception
	 */
	public int getChu(int a, int b) {
		return a / b;
	}

	// 求和函数，用来测试多参数
	public Integer getHe(int a, int b) {
		return a + b;
	}
}
