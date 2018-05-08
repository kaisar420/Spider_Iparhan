package com.iparhan.spider.entity;

public class NewThreeFund {
	
	private String fund_shortName;    //基金简称
	private String fundCompany;       //基金公司
	private Double nav;               //最新净值
	private Double cumulative_nav;    //累积净值
	private String price_date;        //日期
	
	private Double yearNav;           //年化率
	private Double sharperPercent;    //夏普比率
	private int    profit_col5;        //一年评级
	
	
	//时间曲线
	private Double topOneMonth;
	private Double topThreeMonth;
	private Double topHalfYear;
	private Double topOne;
	private Double topTwo;
	private Double topThree;
	private Double topFive;
	//private Double topDate;
	private Double top2018;
	private Double top2017;
	private Double top2016;
	private Double top2015;
	private Double top2014;
	private Double top2013;
	private Double top2012;
	private Double top2011;
	
	
	
	
	public String getFund_shortName() {
		return fund_shortName;
	}
	public void setFund_shortName(String fund_shortName) {
		this.fund_shortName = fund_shortName;
	}
	public String getFundCompany() {
		return fundCompany;
	}
	public void setFundCompany(String fundCompany) {
		this.fundCompany = fundCompany;
	}
	public Double getNav() {
		return nav;
	}
	public void setNav(Double nav) {
		this.nav = nav;
	}
	public Double getCumulative_nav() {
		return cumulative_nav;
	}
	public void setCumulative_nav(Double cumulative_nav) {
		this.cumulative_nav = cumulative_nav;
	}
	public String getPrice_date() {
		return price_date;
	}
	public void setPrice_date(String price_date) {
		this.price_date = price_date;
	}
	public Double getYearNav() {
		return yearNav;
	}
	public void setYearNav(Double yearNav) {
		this.yearNav = yearNav;
	}
	public Double getSharperPercent() {
		return sharperPercent;
	}
	public void setSharperPercent(Double sharperPercent) {
		this.sharperPercent = sharperPercent;
	}
	public int getProfit_col5() {
		return profit_col5;
	}
	public void setProfit_col5(int profit_col5) {
		this.profit_col5 = profit_col5;
	}
	public Double getTopOneMonth() {
		return topOneMonth;
	}
	public void setTopOneMonth(Double topOneMonth) {
		this.topOneMonth = topOneMonth;
	}
	public Double getTopThreeMonth() {
		return topThreeMonth;
	}
	public void setTopThreeMonth(Double topThreeMonth) {
		this.topThreeMonth = topThreeMonth;
	}
	public Double getTopHalfYear() {
		return topHalfYear;
	}
	public void setTopHalfYear(Double topHalfYear) {
		this.topHalfYear = topHalfYear;
	}
	public Double getTopOne() {
		return topOne;
	}
	public void setTopOne(Double topOne) {
		this.topOne = topOne;
	}
	public Double getTopTwo() {
		return topTwo;
	}
	public void setTopTwo(Double topTwo) {
		this.topTwo = topTwo;
	}
	public Double getTopThree() {
		return topThree;
	}
	public void setTopThree(Double topThree) {
		this.topThree = topThree;
	}
	public Double getTopFive() {
		return topFive;
	}
	public void setTopFive(Double topFive) {
		this.topFive = topFive;
	}
	public Double getTop2018() {
		return top2018;
	}
	public void setTop2018(Double top2018) {
		this.top2018 = top2018;
	}
	public Double getTop2017() {
		return top2017;
	}
	public void setTop2017(Double top2017) {
		this.top2017 = top2017;
	}
	public Double getTop2016() {
		return top2016;
	}
	public void setTop2016(Double top2016) {
		this.top2016 = top2016;
	}
	public Double getTop2015() {
		return top2015;
	}
	public void setTop2015(Double top2015) {
		this.top2015 = top2015;
	}
	public Double getTop2014() {
		return top2014;
	}
	public void setTop2014(Double top2014) {
		this.top2014 = top2014;
	}
	public Double getTop2013() {
		return top2013;
	}
	public void setTop2013(Double top2013) {
		this.top2013 = top2013;
	}
	public Double getTop2012() {
		return top2012;
	}
	public void setTop2012(Double top2012) {
		this.top2012 = top2012;
	}
	public Double getTop2011() {
		return top2011;
	}
	public void setTop2011(Double top2011) {
		this.top2011 = top2011;
	}
	@Override
	public String toString() {
		return "NewThreeFund [fund_shortName=" + fund_shortName + ", fundCompany=" + fundCompany + ", nav=" + nav
				+ ", cumulative_nav=" + cumulative_nav + ", price_date=" + price_date + ", yearNav=" + yearNav
				+ ", sharperPercent=" + sharperPercent + ", profit_col5=" + profit_col5 + ", topOneMonth=" + topOneMonth
				+ ", topThreeMonth=" + topThreeMonth + ", topHalfYear=" + topHalfYear + ", topOne=" + topOne
				+ ", topTwo=" + topTwo + ", topThree=" + topThree + ", topFive=" + topFive + ", top2018=" + top2018
				+ ", top2017=" + top2017 + ", top2016=" + top2016 + ", top2015=" + top2015 + ", top2014=" + top2014
				+ ", top2013=" + top2013 + ", top2012=" + top2012 + ", top2011=" + top2011 + "]";
	}
	public NewThreeFund(String fund_shortName, String fundCompany, Double nav, Double cumulative_nav, String price_date,
			Double yearNav, Double sharperPercent, int profit_col5, Double topOneMonth, Double topThreeMonth,
			Double topHalfYear, Double topOne, Double topTwo, Double topThree, Double topFive, Double top2018,
			Double top2017, Double top2016, Double top2015, Double top2014, Double top2013, Double top2012,
			Double top2011) {
		super();
		this.fund_shortName = fund_shortName;
		this.fundCompany = fundCompany;
		this.nav = nav;
		this.cumulative_nav = cumulative_nav;
		this.price_date = price_date;
		this.yearNav = yearNav;
		this.sharperPercent = sharperPercent;
		this.profit_col5 = profit_col5;
		this.topOneMonth = topOneMonth;
		this.topThreeMonth = topThreeMonth;
		this.topHalfYear = topHalfYear;
		this.topOne = topOne;
		this.topTwo = topTwo;
		this.topThree = topThree;
		this.topFive = topFive;
		this.top2018 = top2018;
		this.top2017 = top2017;
		this.top2016 = top2016;
		this.top2015 = top2015;
		this.top2014 = top2014;
		this.top2013 = top2013;
		this.top2012 = top2012;
		this.top2011 = top2011;
	}
	public NewThreeFund() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
