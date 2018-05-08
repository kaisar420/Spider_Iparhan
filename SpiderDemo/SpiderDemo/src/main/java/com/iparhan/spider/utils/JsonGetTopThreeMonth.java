package com.iparhan.spider.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.iparhan.spider.entity.ThreeMonth;
import com.iparhan.spider.entity.Tt;


public class JsonGetTopThreeMonth {
	
	public static List<ThreeMonth> jsonGetThreeMonth(String json){
		 // 
		 Tt tt= JSON.parseObject(json,Tt.class);
		 Map<String,Object> resMap= (Map<String,Object>)tt.getData();
		 List<Map<String, Object>> list=(List<Map<String, Object>>)resMap.get("fundList");
       
		 //封装进一个集合
		//使用集合括起来
		List<ThreeMonth> threeMonths = new ArrayList<ThreeMonth>();
       
		
        for(Map<String, Object> m:list){
        	ThreeMonth threeMonth = new ThreeMonth();
			Double nullValue = 0.0;
			String nullString  = null;
			
       	 System.out.println("hahhahhh=============="+ m.get("advisor_id"));
       	 //企业简称
       	 String fund_short_name = (String) m.get("fund_short_name");
       	 System.out.println("企业简称===="+fund_short_name);
       	 threeMonth.setFund_short_name(fund_short_name);
       	 
       	 //最近净值
       	 String newest_navString =   (String) m.get("nav");
       	 Double newest_nav = Double.parseDouble(newest_navString);
       	 threeMonth.setNewest_nav(newest_nav);
       	 
       	 //成立时间
       	 String estabilishTime = (String) m.get("inception_date");
       	 threeMonth.setEstabilishTime(estabilishTime);
       	 
       	 //今年以来收益
       	 try {
       		String thisYear_nav_String = (String) m.get("ret_ytd");
           	Double thisYear_nav = Double.parseDouble(thisYear_nav_String) * 100;
           	threeMonth.setThisYear_nav(thisYear_nav);
		} catch (Exception e) {
			// TODO: handle exception
			threeMonth.setThisYear_nav(nullValue);
		}
       	
       	
       	 
       	//最大回撤率
       	 try {
       		String top_rate_String = (String) m.get("maxdrawdown_incep");
           	Double top_rate = Double.parseDouble(top_rate_String) * 100;
           	threeMonth.setTop_rate(top_rate);
		} catch (Exception e) {
			// TODO: handle exception
			threeMonth.setTop_rate(nullValue);
			
		}
       	
       	
       	
       	//基金经理
       	threeMonth.setFundManager(nullString);
       	
       	String fundCompany = (String) m.get("company_name");
       	threeMonth.setFundCompany(fundCompany);
       	
       	//给集合赋值
       	threeMonths.add(threeMonth);
       	
        }
        
       
        
		return threeMonths;
	}
	

		
		

}
