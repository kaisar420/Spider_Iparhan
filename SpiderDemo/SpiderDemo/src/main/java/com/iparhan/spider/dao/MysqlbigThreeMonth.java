package com.iparhan.spider.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iparhan.spider.entity.ThreeMonth;

public class MysqlbigThreeMonth {

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
	public static void executeUpdateThreeMonth(List<ThreeMonth> data) throws SQLException {
		
		Object[][] params = new Object[data.size()][7];
		for ( int i=0; i<params.length; i++ ){
			params[i][0] = data.get(i).getFund_short_name();
		    params[i][1] = data.get(i).getNewest_nav();
		    params[i][2] = data.get(i).getEstabilishTime();
		    params[i][3] = data.get(i).getThisYear_nav();
		    params[i][4] = data.get(i).getTop_rate();
		    params[i][5] = data.get(i).getFundManager();
		    params[i][6] = data.get(i).getFundCompany();
		   
		   
		  
		}
		try{
			qr.batch("insert into t_spi_bigthreemonth(funName,newest_nav,estabilishTime,thisYear_nav,top_rate,fundManager,fundCompany) values (?,?,?,?,?,?,?)", params);
			System.out.println("===========插入数据完成===============================");
		}catch( Exception e){
			logger.error(e);
	    }

	}

}
