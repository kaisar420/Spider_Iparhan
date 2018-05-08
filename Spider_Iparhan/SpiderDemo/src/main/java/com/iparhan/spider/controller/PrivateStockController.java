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
import org.json.JSONObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iparhan.spider.dao.MysqlPrivateStock;
import com.iparhan.spider.entity.PrivateStock;
import com.iparhan.spider.utils.IOSave;
import com.iparhan.spider.utils.JsonGetPrivateStock;



/**
 * 私募排行数据爬取
 * @author iparhan
 *
 */
@RestController
public class PrivateStockController {
	
			//返回标志
			public static final String succes = "SUCCESS";
			//目标网址
			public String privateStock_1 = "http://dc.simuwang.com/ranking/get?page=1&condition=fund_type%3A1%2C6%2C4%2C3%2C8%2C2%3Bret%3A1%3Brating_year%3A1%3Bstrategy%3A1%3Bistiered%3A0%3Bcompany_type%3A1%3Bsort_name%3Aprofit_col2%3Bsort_asc%3Adesc%3Bkeyword%3A";
			
			@RequestMapping(value="/privateStock")
			public String spiderCompany(String username, String message) throws ClientProtocolException, IOException, SQLException{
				System.out.println("爬取企业信息业务" + username + message);
				//爬虫数据开始啦
				CloseableHttpClient client = HttpClients.createDefault();  //创建HttpCliaents
				//HTTPGET
				HttpGet httpGet = new HttpGet(privateStock_1);
				httpGet.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; Win64; x64; rv:50.0) Gecko/20100101 Firefox/50.0"); // 设置请求头消息User-Agent
				//请求目标地址
				CloseableHttpResponse closeableHttpResponse = client.execute(httpGet);
				//HttpEntity
				HttpEntity httpEntity = closeableHttpResponse.getEntity();
				//爬过来的数据
				String  privateStock = EntityUtils.toString(httpEntity,"utf-8");
				System.out.println("输出爬取过来的数据"+privateStock);
				
				
				//解析json数据开头数据
				JSONObject jsonObject =  JSONObject.fromObject(privateStock);
				System.out.println(jsonObject);
			
				//爬取的数据存储本地
				String fileName = "privateStock_1";
				IOSave.saveDataToFile(fileName, privateStock);
				System.out.println("====================是否执行到此步骤噢==================");
				
				JSONArray jsonArray = jsonObject.getJSONArray("data");
				//JSONArray jsonArray = jsonObject.getJSONArray(companyData);
				//解析和存储数据库
				List<PrivateStock> jsonArray2 = JsonGetPrivateStock.jsonGetPrivateStock(jsonArray);
				System.out.println("三月牛基输出吧"+jsonArray2);
				MysqlPrivateStock.executeUpdatePrivateStock(jsonArray2);
				System.out.println("===========是否插入数据完成================");
				
				return succes;
			}
}
