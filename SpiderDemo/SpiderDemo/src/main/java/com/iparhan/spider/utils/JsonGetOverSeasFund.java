package com.iparhan.spider.utils;

import java.util.ArrayList;
import java.util.List;

import com.iparhan.spider.entity.OverSeasFund;

import net.sf.json.JSONArray;

public class JsonGetOverSeasFund {
	/*
	 * JSON数据解析使用的
	 */
	public static List<OverSeasFund> jsonGetOverSeasFund(JSONArray jsonArray){
		//使用集合括起来
		List<OverSeasFund>  overSeasFunds = new ArrayList<OverSeasFund>();
		
		//遍历
		for(int i=0;  i< jsonArray.size();i++){
			//私募排汗实体类 使用于爬过来的数据封装成对象
			OverSeasFund overSeasFund = new OverSeasFund();
			Double nullValue = 0.0;
			
			
			//基金简称
			String  fund_shortName = jsonArray.getJSONObject(i).getString("fund_name");
			overSeasFund.setFund_shortName(fund_shortName);
			
			//基金公司
			String fundCompany = jsonArray.getJSONObject(i).getString("company_short_name");
			overSeasFund.setFundCompany(fundCompany);
			
			try{
				//最新净值
				Double nav = jsonArray.getJSONObject(i).getDouble("nav");
				overSeasFund.setNav(nav);
				//日期
				String price_date = jsonArray.getJSONObject(i).getString("price_date");
				overSeasFund.setPrice_date(price_date);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setNav(nullValue);
			}
			
			
			try{
				//累积净值
				Double cumulative_nav = jsonArray.getJSONObject(i).getDouble("cumulative_nav");
				overSeasFund.setCumulative_nav(cumulative_nav);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setCumulative_nav(nullValue);
				
			}
			
			//年化率
			overSeasFund.setYearNav(nullValue);
			//夏普比率
			overSeasFund.setSharperPercent(nullValue);
			
			try{
				//一年评级
				int profit_col5 = jsonArray.getJSONObject(i).getInt("profit_col5");
				overSeasFund.setProfit_col5(profit_col5);
			}catch (Exception e) {
				// TODO: handle exception
				int a = 0;
				overSeasFund.setProfit_col5(a);
			}
			
			
			
			//时间曲线
			
			try{
				//一个月以来
				Double topOneMonth = jsonArray.getJSONObject(i).getDouble("ret_1m");
				System.out.println("一个月以来的数据测试是否为空"+ topOneMonth);
				overSeasFund.setTopOneMonth(topOneMonth);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTopOneMonth(nullValue);
			}
			
			
			try{
				//三个月以来
				Double topThreeMonth = jsonArray.getJSONObject(i).getDouble("ret_3m");
				overSeasFund.setTopThreeMonth(topThreeMonth);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTopThree(nullValue);
			}
			
			
			try{
				//半年以来
				Double topHalfYear = jsonArray.getJSONObject(i).getDouble("ret_6m");
				overSeasFund.setTopHalfYear(topHalfYear);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTopHalfYear(nullValue);
			}
			
			
			try{
				//一年以来
				Double topOne = jsonArray.getJSONObject(i).getDouble("ret_1y");
				overSeasFund.setTopOne(topOne);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTopOne(nullValue);
			}
			
			
			try{
				//两年以来
				Double topTwo = jsonArray.getJSONObject(i).getDouble("ret_2y");
				overSeasFund.setTopTwo(topTwo);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTopTwo(nullValue);
			}
			
			
			try{
				//三年以来
				Double topThree = jsonArray.getJSONObject(i).getDouble("ret_3y");
				System.out.println("测试三年以来的数据是否为空"+ topThree);
				overSeasFund.setTopThree(topThree);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("测试三年以来的数据为空");
				
				overSeasFund.setTopThree(nullValue);
				
			}
			
			
			try {
				//五年以来
				Double topFive = jsonArray.getJSONObject(i).getDouble("ret_5y");
				overSeasFund.setTopFive(topFive);
			} catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTopFive(nullValue);
			}
			
			
			try{
				//2018
				Double top2018 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2018");
				overSeasFund.setTop2018(top2018);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2018(nullValue);
			}
			
			
			try{
				//2017
				Double top2017 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2017");
				overSeasFund.setTop2017(top2017);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2017(nullValue);
			}
			
			
			try {
				//2016
				Double top2016 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2016");
				overSeasFund.setTop2016(top2016);
			} catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2016(nullValue);
			}
			
			try {
				//2015
				Double top2015 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2015");
				overSeasFund.setTop2015(top2015);
			} catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2015(nullValue);
			}
			
			
			try{
				//2014
				Double top2014 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2014");
				overSeasFund.setTop2014(top2014);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2014(nullValue);
			}
			
			try{
				//2013
				Double top2013 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2013");
				overSeasFund.setTop2013(top2013);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2013(nullValue);
			}
			
			try{
				//2012
				Double top2012 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2012");
				overSeasFund.setTop2012(top2012);
			}catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2012(nullValue);
			}
			
			try {
				//2011
				Double top2011 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2011");
				overSeasFund.setTop2011(top2011);
			} catch (Exception e) {
				// TODO: handle exception
				overSeasFund.setTop2011(nullValue);
			}
			
			overSeasFunds.add(overSeasFund);
			
			
		}
		
		return overSeasFunds;
		
	}

}
