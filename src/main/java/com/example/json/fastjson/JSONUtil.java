package com.example.json.fastjson;

import java.util.Date;

import org.junit.Test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.example.json.PersionBean;

/**
 * 转换方法测试类
 */
public class JSONUtil {
	/**
	 * 将指定内容，转换为json的字符串
	 */
	@Test
	public void toJSONString(){
		String text = null;

		// 将javaBean转化为json，javabean是有getter和setter的bean
		PersionBean obj = new PersionBean();
		text = JSON.toJSONString(obj);
		
		System.out.println("javabean输出："+text);
		
		/*如果想要将一个属性，指定为一个特定的名字
			可以在指定的javabean的getter方法上添加，注解@JSONField(name="csage")
		*/
		
		// 转换的json使用''单引号方式输出
		text=JSON.toJSONString(obj, SerializerFeature.UseSingleQuotes);
		
		System.out.println("单引号输出："+text);

		//日期的格式化
		long millis = 1324138987429L;
		Date date = new Date(millis);
		text=JSON.toJSONString(date);
		
		System.out.println("日期："+date);
		System.out.println("日期格式化输出："+text);
		
		//基于格式化输出的SerializerFeature
		text=JSON.toJSONString(date,SerializerFeature.WriteDateUseDateFormat);
		
		System.out.println("日期格式化输出："+text);
		
		//自己指定时间格式
		text=JSON.toJSONStringWithDateFormat(date,"yyyy-MM-dd HH:mm:ss.SSS");
		
		System.out.println("自己指定日期格式输出："+text);
		
		//转换时写入类型信息
		 text = JSON.toJSONString(obj, SerializerFeature.WriteClassName);
		 
		 System.out.println("转换时添加类型信息："+text);
		 
		 //创建一个兼容浏览器的字符串
		 //比如说在iphone上兼容emoji（绘文字）
		 text=JSON.toJSONString(obj, SerializerFeature.BrowserCompatible);
		 
		 System.out.println("兼容浏览器的信息："+text);
		 
	}
	
	/**
	 * 将json串转换为obect等类型<br/>
	 * 实现反序列
	 */
	@Test
	public void toObject(){
		PersionBean p=new PersionBean();
		String text=JSON.toJSONString(p, SerializerFeature.WriteClassName);
		
		//反序列化,必需有类的类型信息
		 PersionBean n= (PersionBean) JSON.parse(text);
		 
		 System.out.println("反序列化输出："+n.toString());
		 
		 //反序列化,无需字符串中有类型信息。直接转换成指定bean
		 PersionBean n2= JSON.parseObject(text,PersionBean.class);
		 
		 System.out.println("反序列化输出："+n2.toString());
		 
		 
		 //获得JSONObject的方法
		 JSONObject b=JSON.parseObject(n2.toString());
		 b.getString("name");
	}
}
