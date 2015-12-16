package com.module.charset;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

/**
 * 转换编码工具类
 */
public class CharsetUtil {
	
	/**
	 * 将gbk编码的转换为utf-8
	 * @throws Exception
	 */
	public void GBKtoUTF8() throws Exception{
		//GBK编码格式源码路径 
		String srcDirPath = "D:\\study-example\\src\\main\\java\\com"; 
		//转为UTF-8编码格式源码路径 
		String utf8DirPath = "D:\\study-example\\src\\main\\java\\to"; 
		        
		//获取所有java文件 
		Collection<File> javaGbkFileCol =  FileUtils.listFiles(new File(srcDirPath), new String[]{"java"}, true); 
		        
		for (File javaGbkFile : javaGbkFileCol) { 
		      //UTF8格式文件路径 
		      String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length()); 
		       //使用GBK读取数据，然后用UTF-8写入数据 
		      FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile, "GBK"));        
		}
	}
	
	public static void main(String[] args){
		CharsetUtil b=new CharsetUtil();
		try {
			b.GBKtoUTF8();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
