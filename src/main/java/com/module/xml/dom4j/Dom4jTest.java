package com.module.xml.dom4j;

import java.util.Iterator;
import java.util.List;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**
 * dom4j解析方式
 */
public class Dom4jTest {

	/**
	 * 解析xml文件
	 * 
	 * @throws Exception
	 */
	@Test
	public void parseXMLbyImooc() throws Exception {
		// 创建reader，用来加载xml
		SAXReader reader = new SAXReader();
		// 通过reader对象的read方法加载books.xml文件,获取docuemnt对象。
		Document document = reader.read(getClass().getResourceAsStream(
				"books.xml"));

		// 可以通过解析字符串方式获得
		// Document document = DocumentHelper.parseText("<csdn></csdn>");

		// 通过document对象获取根节点bookstore
		Element bookStore = document.getRootElement();
		// 通过element对象的elementIterator方法获取迭代器
		@SuppressWarnings("rawtypes")
		Iterator it = bookStore.elementIterator();
		// 遍历迭代器，获取根节点中的信息（书籍）
		while (it.hasNext()) {
			System.out.println("=====开始遍历某一本书=====");
			Element book = (Element) it.next();
			// 获取book的属性名以及 属性值
			@SuppressWarnings("unchecked")
			List<Attribute> bookAttrs = book.attributes();
			for (Attribute attr : bookAttrs) {
				System.out.println("属性名：" + attr.getName() + "--属性值："
						+ attr.getValue());
			}
			@SuppressWarnings("rawtypes")
			Iterator itt = book.elementIterator();
			while (itt.hasNext()) {
				Element bookChild = (Element) itt.next();
				System.out.println("节点名：" + bookChild.getName() + "--节点值："
						+ bookChild.getStringValue());
			}
			System.out.println("=====结束遍历某一本书=====");
		}

	}
}
