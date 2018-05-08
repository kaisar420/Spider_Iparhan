package com.iparhan.spider.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.iparhan.spider.entity.Company;

import net.sf.json.JSONArray;

public class JsonGetCompany {

	
	public static List<Company> jsonGet(JSONArray jsonArray){
				List<Company>  companies = new ArrayList<Company>();
				
 				
				
					//遍历
					for(int i=0;  i< jsonArray.size();i++){
						Company company =  new Company();
						Double nullValue = 0.0;
						//CompanyDate companyDate =  new CompanyDate();
						//企业名称
						String name = jsonArray.getJSONObject(i).getString("company_name");
						//JDBCInsert.insertCompany(name);
						company.setName(name);
						System.out.println("企业名称:" + name);
						
						//核心人物
						String personName = jsonArray.getJSONObject(i).getString("key_manager_name");
						company.setPersonName(personName);
						System.out.println("核心人物名称"+ personName);
						
						//产品数
						String product_count = jsonArray.getJSONObject(i).getString("manage_cnts");
						company.setProduct_count(product_count);
						System.out.println("产品数目"+ product_count);
						
						//代表产品
						String production = jsonArray.getJSONObject(i).getString("fund_short_name");
						company.setProduction(production);
						System.out.println("代表产品"+ production);
						
						//最新净值
						String nav = jsonArray.getJSONObject(i).getString("nav");
						company.setNav(nav);
						System.out.println("最新净值"+nav);
						
						//累积净值
						String cumulative_nav = jsonArray.getJSONObject(i).getString("cumulative_nav");
						company.setCumulative_nav(cumulative_nav);
						System.out.println("累积净值"+ cumulative_nav);
						
						//公司地址
						String provence = jsonArray.getJSONObject(i).getString("province");
						String city = jsonArray.getJSONObject(i).getString("city");
						String address =  provence+" "+"-"+" "+city;
						company.setAddress(address);
						System.out.println("公司地址"+ address);
						
						//备案编码 
						String recordCode  = jsonArray.getJSONObject(i).getString("register_number");
						company.setRecordCode(recordCode);
						System.out.println("备案编码"+ recordCode);
						
						//成立时间
						String establishTime = jsonArray.getJSONObject(i).getString("establish_date");
						company.setEstablishTime(establishTime);
						System.out.println("成立时间"+ establishTime);
						
						//投资策略
						String corestrategy = jsonArray.getJSONObject(i).getString("corestrategy");
						company.setCorestrategy(corestrategy);
						System.out.println("投资策略"+corestrategy);
						String corestrategy2 =  company.getCorestrategy();
						System.out.println(corestrategy2);
						
						//时间曲线
						
						try{
							//一个月以来
							Double topOneMonth = jsonArray.getJSONObject(i).getDouble("ret_1m");
							System.out.println("一个月以来的数据测试是否为空"+ topOneMonth);
							company.setTopOneMonth(topOneMonth);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTopOneMonth(nullValue);
						}
						
						
						try{
							//三个月以来
							Double topThreeMonth = jsonArray.getJSONObject(i).getDouble("ret_3m");
							company.setTopThreeMonth(topThreeMonth);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTopThree(nullValue);
						}
						
						
						try{
							//半年以来
							Double topHalfYear = jsonArray.getJSONObject(i).getDouble("ret_6m");
							company.setTopHalfYear(topHalfYear);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTopHalfYear(nullValue);
						}
						
						
						try{
							//一年以来
							Double topOne = jsonArray.getJSONObject(i).getDouble("ret_1y");
							company.setTopOne(topOne);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTopOne(nullValue);
						}
						
						
						try{
							//两年以来
							Double topTwo = jsonArray.getJSONObject(i).getDouble("ret_2y");
							company.setTopTwo(topTwo);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTopTwo(nullValue);
						}
						
						
						try{
							//三年以来
							Double topThree = jsonArray.getJSONObject(i).getDouble("ret_3y");
							System.out.println("测试三年以来的数据是否为空"+ topThree);
							company.setTopThree(topThree);
						}catch (Exception e) {
							// TODO: handle exception
							System.out.println("测试三年以来的数据为空");
							
							company.setTopThree(nullValue);
							
						}
						
						
						try {
							//五年以来
							Double topFive = jsonArray.getJSONObject(i).getDouble("ret_5y");
							company.setTopFive(topFive);
						} catch (Exception e) {
							// TODO: handle exception
							company.setTopFive(nullValue);
						}
						
						
						try{
							//成立以来的数据
							Double topDate = jsonArray.getJSONObject(i).getDouble("avg_ret_incep");
							company.setTopDate(topDate);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTopDate(nullValue);
						}
						
						
						try{
							//2018
							Double top2018 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2018");
							company.setTop2018(top2018);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTop2018(nullValue);
						}
						
						
						try{
							//2017
							Double top2017 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2017");
							company.setTop2017(top2017);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTop2017(nullValue);
						}
						
						
						try {
							//2016
							Double top2016 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2016");
							company.setTop2016(top2016);
						} catch (Exception e) {
							// TODO: handle exception
							company.setTop2016(nullValue);
						}
						
						try {
							//2015
							Double top2015 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2015");
							company.setTop2015(top2015);
						} catch (Exception e) {
							// TODO: handle exception
							company.setTop2015(nullValue);
						}
						
						
						try{
							//2014
							Double top2014 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2014");
							company.setTop2014(top2014);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTop2014(nullValue);
						}
						
						try{
							//2013
							Double top2013 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2013");
							company.setTop2013(top2013);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTop2013(nullValue);
						}
						
						try{
							//2012
							Double top2012 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2012");
							company.setTop2012(top2012);
						}catch (Exception e) {
							// TODO: handle exception
							company.setTop2012(nullValue);
						}
						
						try {
							//2011
							Double top2011 = jsonArray.getJSONObject(i).getDouble("ret_ytd_2011");
							company.setTop2011(top2011);
						} catch (Exception e) {
							// TODO: handle exception
							company.setTop2011(nullValue);
						}
						
						
						
						
						System.out.println("插入数据前输出一下"+company);
						
						companies.add(company);
						
					}
				
				
				
				System.out.println("插入数据前输出一下"+companies);
				//JDBCUtil.Insert(company);
				return companies;
				
				
				
	}

}
