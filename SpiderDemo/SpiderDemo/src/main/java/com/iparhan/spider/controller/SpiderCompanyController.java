package com.iparhan.spider.controller;

import java.io.IOException;
import java.sql.SQLException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.spider.utils.IOSave;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class SpiderCompanyController {
	//返回标志
	public static final String succes = "SUCCESS";
	//目标网址
	public String threeMonth = "";
	//public String company_20 = "http://dc.simuwang.com/Company/get.html?page=20&condition=ret%3A1%3Bstrategy%3A1%3Bsort_name%3Aprofit_col3%3Bsort_asc%3Adesc%3Bkeyword%3A%3B";
	
	@RequestMapping(value="/spiderCompany")
	public String spiderCompany(String username, String message) throws ClientProtocolException, IOException, SQLException{
		System.out.println("爬取企业信息业务" + username + message);
		//爬虫数据开始啦
		CloseableHttpClient client = HttpClients.createDefault();  //创建HttpCliaents
		//HTTPGET
		HttpGet httpGet = new HttpGet(threeMonth);
		httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0"); // 设置请求头消息User-Agent
		//请求目标地址
		CloseableHttpResponse closeableHttpResponse = client.execute(httpGet);
		//HttpEntity
		HttpEntity httpEntity = closeableHttpResponse.getEntity();
		//爬过来的数据
		String  companyData = EntityUtils.toString(httpEntity,"utf-8");
		System.out.println("输出爬取过来的数据"+companyData);
		
		
		//解析json数据开头数据
		JSONObject jsonObject =  JSONObject.fromObject(companyData);
		System.out.println(jsonObject);
		
		
		/*//提取出error为 0
	    int code = jsonObject.getInt("code");
	    System.out.println("code:" + code);*/

	   /* //提取出status为 success
	    String msg = jsonObject.getString("message");
	    System.out.println("message:" + message);*/
	    
		JSONArray jsonArray = jsonObject.getJSONArray("data");
		
		//爬取的数据存储本地
		String fileName = "threeMonth";
		IOSave.saveDataToFile(fileName, companyData);
		System.out.println("====================是否执行到此步骤噢==================");
		//解析和存储数据库
		/*List<Company> jsonArray2 = JsonGetCompany.jsonGet(jsonArray);
		MYSQLControl.executeUpdate(jsonArray2);*/
		System.out.println("===========是否插入数据完成================");
		
		return succes;
		
	}

}
