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

import com.iparhan.spider.dao.MYSQLControl;
import com.iparhan.spider.dao.MysqlbigThreeMonth;
import com.iparhan.spider.entity.ThreeMonth;
import com.iparhan.spider.utils.IOSave;
import com.iparhan.spider.utils.JsonGetThreeMonth;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@RestController
public class ThreeMonthController {
	
		//返回标志
		public static final String succes = "SUCCESS";
		//目标网址
		public String threeMonth = "http://www.simuwang.com/simulist/getFundList?fund_category_id=27&page=0&_=1524578715758";
		
		@RequestMapping(value="/threeMonth")
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
		
			//爬取的数据存储本地
			String fileName = "threeMonth";
			IOSave.saveDataToFile(fileName, companyData);
			System.out.println("====================是否执行到此步骤噢==================");
			
			JSONArray jsonArray = jsonObject.getJSONArray("fundList");
			//JSONArray jsonArray = jsonObject.getJSONArray(companyData);
			//解析和存储数据库
			List<ThreeMonth> jsonArray2 = JsonGetThreeMonth.jsonGetThreeMonth(jsonArray);
			System.out.println("三月牛基输出吧"+jsonArray2);
			MysqlbigThreeMonth.executeUpdate(jsonArray2);
			System.out.println("===========是否插入数据完成================");
			
			return succes;
		}
}
