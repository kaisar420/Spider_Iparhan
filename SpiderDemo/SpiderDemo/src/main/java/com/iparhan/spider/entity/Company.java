package com.iparhan.spider.entity;


public class Company {
	private String id;
	private String name;          //企业名称
	private String personName;    //核心人物
	private String address;       //公司地址ַ
	private String recordCode;    //备案编码
	private String establishTime; //成立时间
	private String production;    //代表产品
	
	//新添加的参数
	private String product_count;  //产品数目
	private String corestrategy;   //投资策略
	private String nav;            //最新净值ֵ
	private String cumulative_nav; //累积净值   需要*100
	
	//时间曲线
	private Double topOneMonth;
	private Double topThreeMonth;
	private Double topHalfYear;
	private Double topOne;
	private Double topTwo;
	private Double topThree;
	private Double topFive;
	private Double topDate;
	private Double top2018;
	private Double top2017;
	private Double top2016;
	private Double top2015;
	private Double top2014;
	private Double top2013;
	private Double top2012;
	private Double top2011;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getRecordCode() {
		return recordCode;
	}
	public void setRecordCode(String recordCode) {
		this.recordCode = recordCode;
	}
	public String getEstablishTime() {
		return establishTime;
	}
	public void setEstablishTime(String establishTime) {
		this.establishTime = establishTime;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public String getProduct_count() {
		return product_count;
	}
	public void setProduct_count(String product_count) {
		this.product_count = product_count;
	}
	public String getCorestrategy() {
		return corestrategy;
	}
	public void setCorestrategy(String corestrategy) {
		this.corestrategy = corestrategy;
	}
	public String getNav() {
		return nav;
	}
	public void setNav(String nav) {
		this.nav = nav;
	}
	public String getCumulative_nav() {
		return cumulative_nav;
	}
	public void setCumulative_nav(String cumulative_nav) {
		this.cumulative_nav = cumulative_nav;
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
	public Double getTopDate() {
		return topDate;
	}
	public void setTopDate(Double topDate) {
		this.topDate = topDate;
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
		return "Company [id=" + id + ", name=" + name + ", personName=" + personName + ", address=" + address
				+ ", recordCode=" + recordCode + ", establishTime=" + establishTime + ", production=" + production
				+ ", product_count=" + product_count + ", corestrategy=" + corestrategy + ", nav=" + nav
				+ ", cumulative_nav=" + cumulative_nav + ", topOneMonth=" + topOneMonth + ", topThreeMonth="
				+ topThreeMonth + ", topHalfYear=" + topHalfYear + ", topOne=" + topOne + ", topTwo=" + topTwo
				+ ", topThree=" + topThree + ", topFive=" + topFive + ", topDate=" + topDate + ", top2018=" + top2018
				+ ", top2017=" + top2017 + ", top2016=" + top2016 + ", top2015=" + top2015 + ", top2014=" + top2014
				+ ", top2013=" + top2013 + ", top2012=" + top2012 + ", top2011=" + top2011 + "]";
	}
	public Company(String id, String name, String personName, String address, String recordCode, String establishTime,
			String production, String product_count, String corestrategy, String nav, String cumulative_nav,
			Double topOneMonth, Double topThreeMonth, Double topHalfYear, Double topOne, Double topTwo, Double topThree,
			Double topFive, Double topDate, Double top2018, Double top2017, Double top2016, Double top2015,
			Double top2014, Double top2013, Double top2012, Double top2011) {
		super();
		this.id = id;
		this.name = name;
		this.personName = personName;
		this.address = address;
		this.recordCode = recordCode;
		this.establishTime = establishTime;
		this.production = production;
		this.product_count = product_count;
		this.corestrategy = corestrategy;
		this.nav = nav;
		this.cumulative_nav = cumulative_nav;
		this.topOneMonth = topOneMonth;
		this.topThreeMonth = topThreeMonth;
		this.topHalfYear = topHalfYear;
		this.topOne = topOne;
		this.topTwo = topTwo;
		this.topThree = topThree;
		this.topFive = topFive;
		this.topDate = topDate;
		this.top2018 = top2018;
		this.top2017 = top2017;
		this.top2016 = top2016;
		this.top2015 = top2015;
		this.top2014 = top2014;
		this.top2013 = top2013;
		this.top2012 = top2012;
		this.top2011 = top2011;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
