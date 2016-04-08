package com.module.xml.JDKsax;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

/**
 * 和Dom不同，SAX会创建一个Handler逐步解析xml文件
 */
public class SAXExample {

	public void parseXML() {
		// 获得SAXParserFactory工厂类
		SAXParserFactory factory = SAXParserFactory.newInstance();
		try {
			// ͨ根据工厂类获得具体的SAXParser解析类
			SAXParser parser = factory.newSAXParser();

			// 获得当前类的相对路径
			String path = getClass().getResource("").toString();
			// 创建一个解析xml的Handler
			SAXParserHandler handler = new SAXParserHandler();
			parser.parse(path+"/books.xml", handler);
			System.out.println("遍历元素，一共" + handler.getBookList().size()
					+ "个");
			for (Book book : handler.getBookList()) {
				System.out.println(book.getId());
				System.out.println(book.getName());
				System.out.println(book.getAuthor());
				System.out.println(book.getYear());
				System.out.println(book.getPrice());
				System.out.println(book.getLanguage());
				System.out.println("----finish----");
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
