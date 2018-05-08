package com.iparhan.spider.test;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

/*
 * 网页爬去内容
 */
public class SpiderTest {
	/*
	 * Jsonp
	 */
	public Document getDocument(String url){
		try {
			return Jsoup.connect(url).get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
		
	}
	/**
	 * 主方法和爬虫项目
	 * @param args
	 */
	public static void main(String[] args) {
		SpiderTest spiderTest = new SpiderTest();
		Document doc = spiderTest.getDocument("http://dc.simuwang.com/product/HF000049U5");
		System.out.println(doc);
		
		
	}

}
