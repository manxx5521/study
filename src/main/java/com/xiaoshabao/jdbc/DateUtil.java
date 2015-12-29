package com.xiaoshabao.jdbc;


/**
 * 日期工具类
 */
public class DateUtil {
	
	/**
	 * 返回时间的时间戳<br/>
	 * 16位数字，并且有锁每次获得的不同
	 * @return
	 */
	public synchronized static Long getDateNumber(){
		return System.currentTimeMillis();   
	}

}
