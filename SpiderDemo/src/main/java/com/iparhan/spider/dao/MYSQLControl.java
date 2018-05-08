package com.iparhan.spider.dao;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iparhan.spider.entity.Company;


public class MYSQLControl {
	static final Log logger = LogFactory.getLog(MYSQLControl.class);
	static DataSource ds = MyDataSource.getDataSource("jdbc:mysql://127.0.0.1:3306/financial");
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
	public static void executeUpdate(List<Company> data) throws SQLException {
		
		Object[][] params = new Object[data.size()][26];
		for ( int i=0; i<params.length; i++ ){
			params[i][0] = data.get(i).getName();
		    params[i][1] = data.get(i).getPersonName();
		    params[i][2] = data.get(i).getAddress();
		    params[i][3] = data.get(i).getRecordCode();
		    params[i][4] = data.get(i).getEstablishTime();
		    params[i][5] = data.get(i).getProduction();
		    params[i][6] = data.get(i).getProduct_count();
		    params[i][7] = data.get(i).getCorestrategy();
		    params[i][8] = data.get(i).getNav();
		    params[i][9] = data.get(i).getCumulative_nav();
		    
		    //时间曲线
		    params[i][10] = data.get(i).getTopOneMonth();
		    params[i][11] = data.get(i).getTopThreeMonth();
		    params[i][12] = data.get(i).getTopHalfYear();
		    params[i][13] = data.get(i).getTopOne();
		    params[i][14] = data.get(i).getTopTwo();
		    params[i][15] = data.get(i).getTopThree();
		    params[i][16] = data.get(i).getTopFive();
		    params[i][17] = data.get(i).getTopDate();
		    params[i][18] = data.get(i).getTop2018();
		    params[i][19] = data.get(i).getTop2017();
		    params[i][20] = data.get(i).getTop2016();
		    params[i][21] = data.get(i).getTop2015();
		    params[i][22] = data.get(i).getTop2014();
		    params[i][23] = data.get(i).getTop2013();
		    params[i][24] = data.get(i).getTop2012();
		    params[i][25] = data.get(i).getTop2011();
		    
		}
		try{
			qr.batch("insert into t_company(name,personName,address,recordCode,establishTime,production,product_count,corestrategy,nav,cumulative_nav,topOneMonth,topThreeMonth,"
					+ "topHalfYear,topOne,topTwo,topThree,topFive,topDate,top2018,top2017,top2016,top2015,top2014,top2013,top2012,top2011) "
					+ "values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)", params);
			
			//qr.batch("insert into t_date", params);
			
			System.out.println("===========插入数据完成===============================");
//			qr.update("update movie set is_crawler=1 where id='"+id+"'");
		}catch( Exception e){
			logger.error(e);
	    }

	}
	
	
	
}
