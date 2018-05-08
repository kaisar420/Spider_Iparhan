package com.iparhan.spider.utils;

import java.util.ArrayList;
import java.util.List;
import com.iparhan.spider.entity.PrivateStock;
import net.sf.json.JSONArray;

/**
 * 私募排行数据爬取
 * @author Iparhan
 *
 */
public class JsonGetPrivateStock {
	/*
	 * JSON数据解析使用的
	 */
	public static List<PrivateStock> jsonGetPrivateStock(JSONArray jsonArray){
		//使用集合括起来
		List<PrivateStock>  privateStocks = new ArrayList<PrivateStock>();
		
		//遍历
		for(int i=0;  i< jsonArray.size();i++){
			//私募排汗实体类 使用于爬过来的数据封装成对象
			PrivateStock privateStock = new PrivateStock();
			Double nullValue = 0.0;
			
			
			//基金简称
			String  fund_shortName = jsonArray.getJSONObject(i).getString("fund_name");
			privateStock.setFund_shortName(fund_shortName);
			
			//基金公司
			String fundCompany = jsonArray.getJSONObject(i).getString("company_short_name");
			privateStock.setFundCompany(fundCompany);
			
			try{
				//最新净值
				Double nav = jsonArray.getJSONObject(i).getDouble("nav");
				privateStock.setNav(nav);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setNav(nullValue);
			}
			
			
			try{
				//累积净值
				Double cumulative_nav = jsonArray.getJSONObject(i).getDouble("cumulative_nav");
				privateStock.setCumulative_nav(cumulative_nav);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setCumulative_nav(nullValue);
				
			}
			
			
			
			//时间曲线
			
			try{
				//一个月以来
				Double topOneMonth = jsonArray.getJSONObject(i).getDouble("ret_1m");
				System.out.println("一个月以来的数据测试是否为空"+ topOneMonth);
				privateStock.setTopOneMonth(topOneMonth);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTopOneMonth(nullValue);
			}
			
			
			try{
				//三个月以来
				Double topThreeMonth = jsonArray.getJSONObject(i).getDouble("ret_3m");
				privateStock.setTopThreeMonth(topThreeMonth);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTopThree(nullValue);
			}
			
			
			try{
				//半年以来
				Double topHalfYear = jsonArray.getJSONObject(i).getDouble("ret_6m");
				privateStock.setTopHalfYear(topHalfYear);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTopHalfYear(nullValue);
			}
			
			
			try{
				//一年以来
				Double topOne = jsonArray.getJSONObject(i).getDouble("ret_1y");
				privateStock.setTopOne(topOne);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTopOne(nullValue);
			}
			
			
			try{
				//两年以来
				Double topTwo = jsonArray.getJSONObject(i).getDouble("ret_2y");
				privateStock.setTopTwo(topTwo);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTopTwo(nullValue);
			}
			
			
			try{
				//三年以来
				Double topThree = jsonArray.getJSONObject(i).getDouble("ret_3y");
				System.out.println("测试三年以来的数据是否为空"+ topThree);
				privateStock.setTopThree(topThree);
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("测试三年以来的数据为空");
				
				privateStock.setTopThree(nullValue);
				
			}
			
			
			try {
				//五年以来
				Double topFive = jsonArray.getJSONObject(i).getDouble("ret_5y");
				privateStock.setTopFive(topFive);
			} catch (Exception e) {
				// TODO: handle exception
				privateStock.setTopFive(nullValue);
			}
			
			
			try{
				//2018
				Double top2018 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2018");
				privateStock.setTop2018(top2018);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2018(nullValue);
			}
			
			
			try{
				//2017
				Double top2017 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2017");
				privateStock.setTop2017(top2017);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2017(nullValue);
			}
			
			
			try {
				//2016
				Double top2016 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2016");
				privateStock.setTop2016(top2016);
			} catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2016(nullValue);
			}
			
			try {
				//2015
				Double top2015 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2015");
				privateStock.setTop2015(top2015);
			} catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2015(nullValue);
			}
			
			
			try{
				//2014
				Double top2014 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2014");
				privateStock.setTop2014(top2014);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2014(nullValue);
			}
			
			try{
				//2013
				Double top2013 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2013");
				privateStock.setTop2013(top2013);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2013(nullValue);
			}
			
			try{
				//2012
				Double top2012 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2012");
				privateStock.setTop2012(top2012);
			}catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2012(nullValue);
			}
			
			try {
				//2011
				Double top2011 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2011");
				privateStock.setTop2011(top2011);
			} catch (Exception e) {
				// TODO: handle exception
				privateStock.setTop2011(nullValue);
			}
			
			
			
			
		}
		
		return jsonArray;
		
	}

}
