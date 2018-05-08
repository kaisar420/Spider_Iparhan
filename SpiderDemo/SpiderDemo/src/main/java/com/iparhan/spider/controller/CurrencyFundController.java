package com.iparhan.spider.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.spider.dao.MysqlCurrency;
import com.iparhan.spider.entity.CurrencyFund;
import com.iparhan.spider.utils.IOSave;
import com.iparhan.spider.utils.JsonGetCurrency;

/**
 * 货币基金数据爬虫
 * @author Iparhan
 *
 */

@RestController
public class CurrencyFundController {
	//返回标志
	public static final String succes = "SUCCESS";
	//目标网址
	public String threeMonth = "";
	
	@RequestMapping(value="/currencyFund")
	public String spiderCompany(String username, String message) throws ClientProtocolException, IOException, SQLException{
		System.out.println("三月牛基=====================" + username + message);
		//爬虫数据开始啦
		CloseableHttpClient client = HttpClients.createDefault();  //创建HttpCliaents
		//HTTPGET
		HttpGet httpGet = new HttpGet(threeMonth);
		// 设置请求头消息User-Agent
		httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0"); 
		//请求目标地址
		CloseableHttpResponse closeableHttpResponse = client.execute(httpGet);
		//HttpEntity
		HttpEntity httpEntity = closeableHttpResponse.getEntity();
		//爬过来的数据
		String  companyData = EntityUtils.toString(httpEntity,"utf-8");   //这是爬过来的数据 
		System.out.println("输出爬取过来的数据"+companyData);
		
		 
		
		//爬取的数据存储本地
		String fileName = "currencyFund";
		IOSave.saveDataToFile(fileName, companyData);
		System.out.println("====================是否执行到此步骤噢==================");
		
		//解析和存储到数据库
		//解析JSON数据
		List<CurrencyFund> threeMonths = JsonGetCurrency.jsonGetCurrencyFund(companyData);
		MysqlCurrency.executeUpdateCurrencyFund(threeMonths);
		System.out.println("===========是否插入数据完成================");
		
		
		return succes;
	}
	

}
