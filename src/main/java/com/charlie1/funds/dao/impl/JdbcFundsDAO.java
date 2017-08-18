package com.charlie1.funds.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.charlie1.funds.dao.FundsDAO;
import com.charlie1.funds.model.jPerformanceData;



public class JdbcFundsDAO extends JdbcDaoSupport implements FundsDAO
{

	

	public String buildStrPeformanceData(String risk1, String risk2){
		
		
		
		 String jsonstr = "";
		
		 String performancestr = "select P.SymID,P.InceptionDate_,P.MER_,P.Assets_,P.Rank_,P.MstarRating_,P.StdDev_,P.VolatileRank_," +
	               "P.MstarRisk_,P.Alpha_,P.Beta_,P.Rsquared_,P.RRSPEligibility_,P.Load_,P.MaxFrontEnd_,P.MaxBackEnd_,P.SaleOpen_,P.NavPS_," +
	               "P.NetAsset_,P.Yield_,P.Dividend_,P.Managers_,P.Fees_,P.FundName_" +
	               " from PerformanceData P where  P.volatilerank_ >= '" + risk1 + "' and P.volatilerank_ <= '" + risk2 + "'";

	
		List <Map> rows = getJdbcTemplate().queryForList(performancestr);
		for (Map row : rows) {
			jPerformanceData jperform = new jPerformanceData();
			
			jperform.setAlpha((Double)row.get("Alpha_"));
			jperform.setAssets((Double)row.get("Assets_"));
			jperform.setBeta((Double)row.get("Beta_"));
			jperform.setDividend((Double)row.get("Dividend_"));
			jperform.setFees((Double)row.get("Fees_"));
			jperform.setFundName((String)row.get("FundName_"));
			//jperform.setInceptionDate((Date)row.get("InceptionDate_"));
			jperform.setLoad((String)row.get("Load_"));
			jperform.setManagers((String)row.get("Managers_"));
			jperform.setMaxBackEnd((Double)row.get("MaxBackEnd_"));
			jperform.setMER((Double)row.get("MER_"));
			jperform.setMstarRating((Double)row.get("MstarRating_"));
			jperform.setMstarRisk((Double)row.get("MstarRisk_"));
			jperform.setNavPS((Double)row.get("NavPS_"));
			jperform.setRank((Double)row.get("Rank_"));
			jperform.setRRSPEligibility((String)row.get("RRSPEligibility_"));
			jperform.setRsquared((Double)row.get("Rsquared_"));
			jperform.setSaleOpen((String)row.get("SaleOpen_"));
			jperform.setStdDev((Double)row.get("StdDev_"));
			jperform.setSymID((String)row.get("SymID"));
			jperform.setVolatileRank((Double)row.get("VolatileRank_"));
			jperform.setYield((Double)row.get("Yield_"));
			
			
			
			
			
			 jsonstr += jperform.toString();
             jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	

	
	
}
