package com.iparhan.spider.entity;

import java.util.List;

/**
 * 三月牛基
 * @author Iparhan
 *
 */
public class ThreeMonth {
	
	private String fund_short_name;         //基金名称
	private Double newest_nav;      //最新净值
	private String estabilishTime;  //成立日期
	private Double thisYear_nav;    //今年以来收益
	private Double top_rate;        //最大回撤率
	private String fundManager;     //基金经理
	private String fundCompany;     //基金公司
	
	
	

	public String getFund_short_name() {
		return fund_short_name;
	}

	public void setFund_short_name(String fund_short_name) {
		this.fund_short_name = fund_short_name;
	}

	public Double getNewest_nav() {
		return newest_nav;
	}

	public void setNewest_nav(Double newest_nav) {
		this.newest_nav = newest_nav;
	}

	public String getEstabilishTime() {
		return estabilishTime;
	}

	public void setEstabilishTime(String estabilishTime) {
		this.estabilishTime = estabilishTime;
	}

	public Double getThisYear_nav() {
		return thisYear_nav;
	}

	public void setThisYear_nav(Double thisYear_nav) {
		this.thisYear_nav = thisYear_nav;
	}

	public Double getTop_rate() {
		return top_rate;
	}

	public void setTop_rate(Double top_rate) {
		this.top_rate = top_rate;
	}

	public String getFundManager() {
		return fundManager;
	}

	public void setFundManager(String fundManager2) {
		this.fundManager = fundManager2;
	}

	public String getFundCompany() {
		return fundCompany;
	}

	public void setFundCompany(String fundCompany) {
		this.fundCompany = fundCompany;
	}

	

	@Override
	public String toString() {
		return "ThreeMonth [fund_short_name=" + fund_short_name + ", newest_nav=" + newest_nav + ", estabilishTime="
				+ estabilishTime + ", thisYear_nav=" + thisYear_nav + ", top_rate=" + top_rate + ", fundManager="
				+ fundManager + ", fundCompany=" + fundCompany + ", child=" + "]";
	}

	public ThreeMonth(String fund_short_name, Double newest_nav, String estabilishTime, Double thisYear_nav,
			Double top_rate, String fundManager, String fundCompany, List<ThreeMonth> child) {
		super();
		this.fund_short_name = fund_short_name;
		this.newest_nav = newest_nav;
		this.estabilishTime = estabilishTime;
		this.thisYear_nav = thisYear_nav;
		this.top_rate = top_rate;
		this.fundManager = fundManager;
		this.fundCompany = fundCompany;
		
	}

	public ThreeMonth() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
