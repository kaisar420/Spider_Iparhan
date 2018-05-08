package com.iparhan.spider.utils;

import java.util.ArrayList;
import java.util.List;

import com.iparhan.spider.entity.ThreeMonth;

import net.sf.json.JSONArray;

/**
 * 三月牛基
 * @author Iparhan
 *
 */
public class JsonGetThreeMonth {
	
	public static List<ThreeMonth> jsonGetThreeMonth(JSONArray jsonArray){
		List<ThreeMonth> threeMonths = new ArrayList<ThreeMonth>();
		
		for(int i=0;  i< jsonArray.size();i++){
			ThreeMonth threeMonth = new ThreeMonth();
			//如果空就代替
			Double nullValue = 0.0;
			
			//基金名称
			String funName = jsonArray.getJSONObject(i).getString("fund_short_name");
			threeMonth.setFunName(funName);
			
			try{
				//最新净值
				Double newest_nav = jsonArray.getJSONObject(i).getDouble("nav");
				threeMonth.setNewest_nav(newest_nav);
			}catch (Exception e) {
				// TODO: handle exception
				threeMonth.setNewest_nav(nullValue);
			}
			
			
			//成立日期
			String estabilishTime = jsonArray.getJSONObject(i).getString("publish_time");
			threeMonth.setEstabilishTime(estabilishTime);
			
			try{
				//今年以来收益
				Double thisYear_nav = jsonArray.getJSONObject(i).getDouble("ret_ytd");
				threeMonth.setThisYear_nav(thisYear_nav);
			}catch (Exception e) {
				// TODO: handle exception
				threeMonth.setThisYear_nav(nullValue);
			}
			
			
			try {
				//最大回撤率
				Double top_rate = jsonArray.getJSONObject(i).getDouble("maxdrawdown_incep");
				threeMonth.setTop_rate(top_rate);
			} catch (Exception e) {
				// TODO: handle exception
				threeMonth.setTop_rate(nullValue);
				
			}
			
			
			//基金经理
			String fundManager = jsonArray.getJSONObject(i).getString("managers_name");
			threeMonth.setFundManager(fundManager);
			
			//公司名称
			String fundCompany = jsonArray.getJSONObject(i).getString("company_name");
			
			//输出一下
			System.out.println("三月牛基输出"+threeMonth);
			threeMonths.add(threeMonth);
			
		}
		return threeMonths;
		
	}
	
	

}
