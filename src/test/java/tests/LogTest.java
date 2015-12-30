package tests;

import org.apache.log4j.Logger;
import org.junit.Test;

public class LogTest {
	
	Logger logger=Logger.getLogger(LogTest.class);
	
	@Test
	public void getInfo(){
		logger.info("测试");
	}
}
