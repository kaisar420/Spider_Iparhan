package com.iparhan.spider.dao;

import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.iparhan.spider.entity.Company;
import com.iparhan.spider.entity.ThreeMonth;

public class MysqlbigThreeMonth {
	
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
	 * 三月牛基
	 * @param data
	 * @throws SQLException
	 */
	public static void executeUpdate(List<ThreeMonth> data) throws SQLException {
		
		Object[][] params = new Object[data.size()][7];
		for ( int i=0; i<params.length; i++ ){
			params[i][0] = data.get(i).getFunName();
		    params[i][1] = data.get(i).getNewest_nav();
		    params[i][2] = data.get(i).getEstabilishTime();
		    params[i][3] = data.get(i).getThisYear_nav();
		    params[i][4] = data.get(i).getTop_rate();
		    params[i][5] = data.get(i).getFundManager();
		    params[i][6] = data.get(i).getFundCompany();
		    
		}
		try{
			qr.batch("insert into t_spi_bigthreemonth(funName,newest_nav,estabilishTime,thisYear_nav,top_rate,fundManager,fundCompany) "
					+ "values (?,?,?,?,?,?,?)", params);
			
			//qr.batch("insert into t_date", params);
			
			System.out.println("===========三月牛基————————插入数据完成===============================");
//			qr.update("update movie set is_crawler=1 where id='"+id+"'");
		}catch( Exception e){
			logger.error(e);
	    }
	
	}
}
