package tests;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;


public class Test {
	
	public static void main (String[] args){
		try {
			@SuppressWarnings("unused")
			Configuration conf=new PropertiesConfiguration("conf-test.properties");
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	//cc111

}
