package com.iparhan.spider.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iparhan.spider.entity.CurrencyFund;

/**
 * 货币基金
 * @author Iparhan
 *
 */
public class MysqlCurrency {
	
	
	/**
	 * 三月牛基
	 */
	
	static final Log logger = LogFactory.getLog(MYSQLControl.class);
	static DataSource ds = MyDataSource.getDataSource("jdbc:mysql://127.0.0.1:3307/financial?useUnicode=true&characterEncoding=utf-8&useSSL=false");
	static QueryRunner qr = new QueryRunner(ds);
	public static void executeUpdate(String sql){
      try {
        qr.update(sql);
      } catch (SQLException e) {
    	  logger.error(e);
      }
	}
	
	/**
	 * 企业信息
	 * @param data
	 * @throws SQLException
	 */
	public static void executeUpdateCurrencyFund(List<CurrencyFund> data) throws SQLException {
		
		Object[][] params = new Object[data.size()][8];
		for ( int i=0; i<params.length; i++ ){
			params[i][0] = data.get(i).getFund_name();
		    params[i][1] = data.get(i).getFund_code();
		    params[i][2] = data.get(i).getCompany_short_name();
		    params[i][3] = data.get(i).getScale();
		    params[i][4] = data.get(i).getRet_m();
		    params[i][5] = data.get(i).getRet_1y_a();
		    params[i][6] = data.get(i).getRedeem_account();
		    params[i][7] = data.get(i).getSubscription_amount();
		   
		   
		  
		}
		try{
			qr.batch("insert into t_spi_currency(fund_name,fund_code,company_short_name,scale,ret_m,ret_1y_a,redeem_account,subscription_amount) values (?,?,?,?,?,?,?,?)", params);
			System.out.println("===========插入数据完成===============================");
		}catch( Exception e){
			logger.error(e);
	    }

	}

}
