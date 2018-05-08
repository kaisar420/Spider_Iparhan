package com.iparhan.spider.entity;

/**
 * 货币基金
 * @author Iparhan
 *
 */
public class CurrencyFund {
	private String fund_name;
	private String fund_code;
	private String company_short_name;
	private Double scale;
	private Double ret_m;
	private Double ret_1y_a;
	private String redeem_account;
	private String subscription_amount;
	
	
	public String getFund_name() {
		return fund_name;
	}
	public void setFund_name(String fund_name) {
		this.fund_name = fund_name;
	}
	public String getFund_code() {
		return fund_code;
	}
	public void setFund_code(String fund_code) {
		this.fund_code = fund_code;
	}
	public String getCompany_short_name() {
		return company_short_name;
	}
	public void setCompany_short_name(String company_short_name) {
		this.company_short_name = company_short_name;
	}
	public Double getScale() {
		return scale;
	}
	public void setScale(Double scale) {
		this.scale = scale;
	}
	public Double getRet_m() {
		return ret_m;
	}
	public void setRet_m(Double ret_m) {
		this.ret_m = ret_m;
	}
	public Double getRet_1y_a() {
		return ret_1y_a;
	}
	public void setRet_1y_a(Double ret_1y_a) {
		this.ret_1y_a = ret_1y_a;
	}
	public String getRedeem_account() {
		return redeem_account;
	}
	public void setRedeem_account(String redeem_account) {
		this.redeem_account = redeem_account;
	}
	public String getSubscription_amount() {
		return subscription_amount;
	}
	public void setSubscription_amount(String subscription_amount) {
		this.subscription_amount = subscription_amount;
	}
	@Override
	public String toString() {
		return "CurrencyFund [fund_name=" + fund_name + ", fund_code=" + fund_code + ", company_short_name="
				+ company_short_name + ", scale=" + scale + ", ret_m=" + ret_m + ", ret_1y_a=" + ret_1y_a
				+ ", redeem_account=" + redeem_account + ", subscription_amount=" + subscription_amount + "]";
	}
	public CurrencyFund(String fund_name, String fund_code, String company_short_name, Double scale, Double ret_m,
			Double ret_1y_a, String redeem_account, String subscription_amount) {
		super();
		this.fund_name = fund_name;
		this.fund_code = fund_code;
		this.company_short_name = company_short_name;
		this.scale = scale;
		this.ret_m = ret_m;
		this.ret_1y_a = ret_1y_a;
		this.redeem_account = redeem_account;
		this.subscription_amount = subscription_amount;
	}
	public CurrencyFund() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
