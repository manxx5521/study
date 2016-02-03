package com.module.configuration;

import java.io.InputStream;
import java.util.Properties;

/**
 * 读取配置文件properties方法
 * <p>方法仅作参考,文件输入流还没有关闭，有待调整</p>
 * @author mxv
 *
 */
public class PropertiesLoad {
	
	//startdate和totalweek是配置属性
	private static String startdate = null;
	private static String totalweek = null;
	static {
		loads();
	}

	synchronized static public void loads() {
		if (startdate == null || totalweek == null) {
			InputStream is = PropertiesLoad.class
					.getResourceAsStream("conf-test.properties");
			Properties dbProps = new Properties();
			try {
				dbProps.load(is);

				// 读取属性
				startdate = dbProps.getProperty("startdate");
				totalweek = dbProps.getProperty("totalweek");
				
			} catch (Exception e) {
				System.err.println("不能读取属性文件. "
						+ "请确保db.properties在CLASSPATH指定的路径中");
			}
		}
	}

	public static String getStartdate() {
		if (startdate == null)
			loads();
		return startdate;
	}

	public static String getTotalweek() {
		if (startdate == null)
			loads();
		return totalweek;
	}

}
