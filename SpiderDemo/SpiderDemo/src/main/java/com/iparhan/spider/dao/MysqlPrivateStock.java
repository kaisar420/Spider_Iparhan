package com.iparhan.spider.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iparhan.spider.entity.PrivateStock;

public class MysqlPrivateStock {
	
	static final Log logger = LogFactory.getLog(MYSQLControl.class);
	static DataSource ds = MyDataSource.getDataSource("jdbc:mysql://127.0.0.1:3307/financial");
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
	public static void executeUpdatePrivateStock(List<PrivateStock> data) throws SQLException {
		
		Object[][] params = new Object[data.size()][23];
		for ( int i=0; i<params.length; i++ ){
			params[i][0] = data.get(i).getFund_shortName();
		    params[i][1] = data.get(i).getFundCompany();
		    params[i][2] = data.get(i).getNav();
		    params[i][3] = data.get(i).getPrice_date();
		    params[i][4] = data.get(i).getCumulative_nav() ;
		    params[i][5] = data.get(i).getYearNav();
		    params[i][6] = data.get(i).getSharperPercent() ;
		    params[i][7] = data.get(i).getProfit_col5();
		   
		    
		    //时间曲线
		    params[i][8] = data.get(i).getTopOneMonth();
		    params[i][9] = data.get(i).getTopThreeMonth();
		    params[i][10]= data.get(i).getTopHalfYear();
		    params[i][11] = data.get(i).getTopOne();
		    params[i][12] = data.get(i).getTopTwo();
		    params[i][13] = data.get(i).getTopThree();
		    params[i][14] = data.get(i).getTopFive();
		    
		    params[i][15] = data.get(i).getTop2018();
		    params[i][16] = data.get(i).getTop2017();
		    params[i][17] = data.get(i).getTop2016();
		    params[i][18] = data.get(i).getTop2015();
		    params[i][19] = data.get(i).getTop2014();
		    params[i][20] = data.get(i).getTop2013();
		    params[i][21] = data.get(i).getTop2012();
		    params[i][22] = data.get(i).getTop2011();
		    
		}
		try{
			qr.batch("insert into t__spi_privatestock(fund_shortName,fundCompany,nav,price_date,cumulative_nav,yearNav,sharperPercent,profit_col5,topOneMonth,topThreeMonth,"
					+ "topHalfYear,topOne,topTwo,topThree,topFive,top2018,top2017,top2016,top2015,top2014,top2013,top2012,top2011) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", params);
			
			//qr.batch("insert into t_date", params);
			
			System.out.println("===========插入数据完成===============================");
//			qr.update("update movie set is_crawler=1 where id='"+id+"'");
		}catch( Exception e){
			logger.error(e);
	    }

	}
	
	

}
