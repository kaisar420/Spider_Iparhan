package com.iparhan.spider.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.alibaba.fastjson.JSON;
import com.iparhan.spider.entity.CurrencyFund;
import com.iparhan.spider.entity.Tt;

/**
 * 货币基金
 * @author Iparhan
 */
public class JsonGetCurrency {
	
	public static List<CurrencyFund> jsonGetCurrencyFund(String json){
		 //
		 Tt tt= JSON.parseObject(json,Tt.class);
		 Map<String,Object> resMap= (Map<String,Object>)tt.getData();
		 List<Map<String, Object>> list=(List<Map<String, Object>>)resMap.get("fundList");
     
		//封装进一个集合
		//使用集合括起来
		List<CurrencyFund> currencyFunds = new ArrayList<CurrencyFund>();
     
		
		for(Map<String, Object> m:list){
    	  CurrencyFund currencyFund = new CurrencyFund();
    	  Double nullValue = 0.0;
    	  String nullString  = null;
			
			//fund_name  基金名称
			String fund_name = (String) m.get("fund_name");
			System.out.println("基金名称" + fund_name);
			currencyFund.setFund_name(fund_name);
			
			//fund_code    基金代码
			String  fund_code = (String) m.get("fund_code");
			System.out.println("基金代码"+fund_code);
			currencyFund.setFund_code(fund_code);
			
			//company_short_name     基金公司
			String company_short_name = (String) m.get("company_short_name");
			currencyFund.setCompany_short_name(company_short_name);
			
			//scale   基金规模
			try {
				String scale_String = (String) m.get("scale");
				Double scale = Double.parseDouble(scale_String);
				currencyFund.setScale(scale);
			} catch (Exception e) {
				// TODO: handle exception
				currencyFund.setScale(nullValue);
			}
			
			//ret_m      每万份收益
			try{
				String ret_m_String = (String) m.get("ret_m");
				Double  ret_m = Double.parseDouble(ret_m_String);
				currencyFund.setRet_m(ret_m);
			}catch (Exception e) {
				// TODO: handle exception
				currencyFund.setRet_m(nullValue);
			}
			
			//ret_1y_a   七日年化收益
			try {
				String ret_1y_a_String = (String) m.get("ret_1y_a");
				Double ret_1y_a = Double.parseDouble(ret_1y_a_String);
				currencyFund.setRet_1y_a(ret_1y_a);
			} catch (Exception e) {
				// TODO: handle exception
				currencyFund.setRet_1y_a(nullValue);
			}
			
			
			//redeem_account   赎回到账
			String redeem_accout = (String) m.get("redeem_accout");
			currencyFund.setRedeem_account(redeem_accout);
			
			//subscription_amount   起投金额
			String subscription_amount = (String) m.get("subscription_amount");
			currencyFund.setSubscription_amount(subscription_amount);
			
			
			currencyFunds.add(currencyFund);
			
      }
	return currencyFunds;

	}
}
