package com.module.junit;
/**
 * 这个使用指定的Runner，进行参数化处理
 */
public class RunWithExample {
	
	private static int result=0;
	
	// 求和函数，用来测试多参数
	public Integer getHe(int a, int b) {
		result= a+b;
		return a + b;
	}

	public int getResult() {
		return result;
	}
	
}
