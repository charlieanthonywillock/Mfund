package com.charlie1.funds.dao.impl;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.charlie1.funds.dao.FundsDAO;
import com.charlie1.funds.model.jPerformanceData;
import com.charlie1.funds.model.jHoldings;
import com.charlie1.funds.model.jPerformanceReturns;
import com.charlie1.funds.model.jPerformanceData;
import com.charlie1.funds.model.jHDstats;
import com.charlie1.funds.model.jChartAsset;
import com.charlie1.funds.model.jChartSector;
import com.charlie1.funds.model.jChartGeography;
import com.charlie1.funds.model.jPerfCalender;
import com.charlie1.funds.model.jIndexes;





public class JdbcFundsDAO extends JdbcDaoSupport implements FundsDAO
{

	

	public String buildStrPeformanceData(String risk1, String risk2){
		
		
		SimpleDateFormat SDF = new SimpleDateFormat("yy-MM-dd");
		// SimpleDateFormat SDF = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		
		 String jsonstr = "";
		
		 String performancestr = "select P.SymID,P.InceptionDate_,P.MER_,P.Assets_,P.Rank_,P.MstarRating_,P.StdDev_,P.VolatileRank_," +
	               "P.MstarRisk_,P.Alpha_,P.Beta_,P.Rsquared_,P.RRSPEligibility_,P.Load_,P.MaxFrontEnd_,P.MaxBackEnd_,P.SaleOpen_,P.NavPS_," +
	               "P.NetAsset_,P.Yield_,P.Dividend_,P.Managers_,P.Fees_,P.FundName_" +
	               " from PerformanceData P where  P.volatilerank_ >= '" + risk1 + "' and P.volatilerank_ <= '" + risk2 + "'";

	

		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(performancestr);
		for (Map<String,Object> row : rows) {
			jPerformanceData jperform = new jPerformanceData();
			
			jperform.setAlpha((Double)row.get("Alpha_"));
			jperform.setAssets((Double)row.get("Assets_"));
			jperform.setBeta((Double)row.get("Beta_"));
			jperform.setDividend((Double)row.get("Dividend_"));
			jperform.setFees((Double)row.get("Fees_"));
			jperform.setFundName((String)row.get("FundName_"));
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
			
			
			try {
				
				jperform.setInceptionDate(SDF.parse((String)row.get("InceptionDate_")));
				
				
			}
			catch(Exception ex) {
				
				ex.printStackTrace();
			}
			
			
			
		     jsonstr += jperform.toString();
             jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	

	public String buildStrHoldingsData(String risk1, String risk2) {
		
		
		
		 String jsonstr = "";
		
		 String holdingstr = "select h.FundSymID,h.symid,h.name,aa.asset,sa.sector,ga.geograph,h.percentage from holdings H left join AssetAllocation AA on H.assetid = AA.assetid left join SectorAllocation SA on H.sectorid = SA.sectorid left join GeographAllocation GA on H.geographid = GA.geographid left join PerformanceData P on H.FundSymID = P.SymID where P.volatilerank_ >= '" + risk1 + "' and P.volatilerank_ <= '" + risk2 + "'";
	
	
		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(holdingstr);
		for (Map<String,Object> row : rows) {
			jHoldings holdings = new jHoldings();
			
			holdings.setFundSymID((String)row.get("FundSymID"));
			holdings.setSymID((String)row.get("symid"));
			holdings.setName((String)row.get("name"));
			holdings.setAsset((String)row.get("asset"));
			holdings.setSector((String)row.get("sector"));
			holdings.setGeograph((String)row.get("geograph"));
			holdings.setPercentage((Double)row.get("percentage"));
		
					
			
			
			
			jsonstr += holdings.toString();
            jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	
	public String buildStrReturnsData(String risk1, String risk2) {
		
		
		
		 String jsonstr = "";
		
		 String returnstr = "select PDR.return_,PDR.OneMonth,PDR.ThreeMonth,PDR.SixMonth,PDR.YTD,PDR.OneYear,PDR.ThreeYear,PDR.FiveYear,PDR.TenYear from PerformanceDataReturn PDR left join PerformanceData P on PDR.return_ = P.SymID where P.volatilerank_ >= '"+ risk1 +"' and P.volatilerank_ <= '"+risk2+"'";


	
		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(returnstr);
		for (Map<String,Object> row : rows) {
			jPerformanceReturns returns = new jPerformanceReturns();
			
			returns.setReturn((String)row.get("Return_"));
			returns.setOneMonth((Double)row.get("OneMonth"));
			returns.setThreeMonth((Double)row.get("ThreeMonth"));
			returns.setSixMonth((Double)row.get("SixMonth"));
			returns.setYTD((Double)row.get("YTD"));
			returns.setOneYear((Double)row.get("OneYear"));
			returns.setThreeYear((Double)row.get("ThreeYear"));
			returns.setFiveYear((Double)row.get("FiveYear"));
			returns.setTenYear((Double)row.get("TenYear"));
		
					
			
			
			
			jsonstr += returns.toString();
           jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	
	
	 public String buildStrHistoricalData(String risk1, String risk2){
		
		
		 SimpleDateFormat SDF = new SimpleDateFormat("yy-MM-dd");
			
		
		 String jsonstr = "";
		
		 String symbolstr = "select S.symbol_,S.Epoch_,S.Open_,S.High_,S.Low_ ,S.Close_,S.Close_Adj,S.Volume_  from PerformanceData P " +
		            "left join Symbols S on substring(s.symbol_, 1, LEN(S.symbol_) - 2) = P.SymID where P.volatilerank_ >= '" + risk1 + "' and P.volatilerank_ <= '" + risk2 + "' and symbol_ != ''";


	
		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(symbolstr);
		for (Map<String,Object> row : rows) {
			jHDstats stats = new jHDstats();
			
			stats.setSymbol((String)row.get("symbol_"));
			//stats.setEpoch((Double)row.get("epoch_"));
			stats.setOpen((Double)row.get("open_"));
			stats.setHigh((Double)row.get("high_"));
			stats.setLow((Double)row.get("low_"));
			stats.setClose((Double)row.get("close_"));
			stats.setClose_adj((Double)row.get("close_adj"));
			stats.setVolume((int)row.get("volume_"));
			
			
			
			try {
				
				stats.setEpoch(SDF.parse((String)row.get("epoch_")));
				
				
			}
			catch(Exception ex) {
				
				ex.printStackTrace();
			}
			
			
			
			
					
			
			
			
			jsonstr += stats.toString();
          jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	
	public String buildStrChartSector(String fund){
			
			
			
		 String jsonstr = "";
		
		 String query = "select SA.Sector, count(H.sectorID) as count, (100 * count(*) / (select count(*)   from holdings where fundsymid = '" + fund + "'))  as [Percent] from holdings H left join SectorAllocation SA on H.sectorid = SA.sectorid where fundsymid = '" + fund + "' group by SA.sector";


	
		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(query);
		for (Map<String,Object> row : rows) {
			jChartSector funds = new jChartSector();
			
			funds.setFund((String)fund);
			funds.setSector((String)row.get("Sector"));
			funds.setCount((int)row.get("Count"));
			funds.setPercent((int)row.get("Percent"));
			
					
			
			
			
			jsonstr += funds.toString();
          jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	
	
	public String buildStrChartAsset(String fund){
			
			
			
		 String jsonstr = "";
		
		   String query = "select AA.Asset, count(H.sectorID) as count, (100 * count(*) / (select count(*)   from holdings where fundsymid = '" + fund + "'))  as [Percent] from holdings H left join AssetAllocation AA on H.assetid = AA.assetid where fundsymid = '" + fund + "' group by AA.Asset";



	
		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(query);
		for (Map<String,Object> row : rows) {
			jChartSector funds = new jChartSector();
			
			funds.setFund((String)fund);
			funds.setSector((String)row.get("Asset"));
			funds.setCount((int)row.get("Count"));
			funds.setPercent((int)row.get("Percent"));
			
					
			
			
			
			jsonstr += funds.toString();
          jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	
	 
	public String buildStrChartGeograph(String fund){
		
			
			
		 String jsonstr = "";
		
		 String query = "select GA.Geograph, count(H.sectorID) as count, (100 * count(*) / (select count(*)   from holdings where fundsymid = '" + fund + "'))  as [Percent] from holdings H left join GeographAllocation GA on H.Geographid = GA.Geographid where fundsymid = '" + fund + "' group by GA.Geograph";


	
		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(query);
		for (Map<String,Object> row : rows) {
			jChartSector funds = new jChartSector();
			
			funds.setFund((String)fund);
			funds.setSector((String)row.get("Geograph"));
			funds.setCount((int)row.get("Count"));
			funds.setPercent((int)row.get("Percent"));
			
					
			
			
			
			jsonstr += funds.toString();
          jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	
	public  String buildStrPerformanceCalander(String risk1, String risk2) {		
			
			
		 String jsonstr = "";
		 SimpleDateFormat SDF = new SimpleDateFormat("yy-MM-dd");
		
		 String query = "select c.Year_,c.Symbol_,c.NavPS_ from PerformanceCalander c left join performancedata d on c.symbol_ = d.symid where d.volatilerank_ >='" + risk1 +"' and d.volatilerank_ <= '"+risk2+"'";



	
		 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(query);
		for (Map<String,Object> row : rows) {
			jPerfCalender cal = new jPerfCalender();
			
			
			
			//cal.setDate((Date)row.get("Year_"));
			cal.setSymbol((String)row.get("Symbol_"));
			cal.setNavPS((Double)row.get("NavPS_"));
			
			
			
			try {
				
				cal.setDate(SDF.parse((String)row.get("Year_")));
				
				
			}
			catch(Exception ex) {
				
				ex.printStackTrace();
			}
					
			
			
			
			
			
			
			jsonstr += cal.toString();
          jsonstr += ",";

			
			
		}
		
		return jsonstr;
		
		
	}
	  
	 
	  
public Iterator getFundsbyRisk(String risk1, String risk2)
	    {
		
	
			ArrayList<String> jlist = new ArrayList<String>();
		
			
			
			 String jsonstr = "";
			 String buildstr = "";
			
			 String performancestr = "select P.SymID,P.InceptionDate_,P.MER_,P.Assets_,P.Rank_,P.MstarRating_,P.StdDev_,P.VolatileRank_," +
		               "P.MstarRisk_,P.Alpha_,P.Beta_,P.Rsquared_,P.RRSPEligibility_,P.Load_,P.MaxFrontEnd_,P.MaxBackEnd_,P.SaleOpen_,P.NavPS_," +
		               "P.NetAsset_,P.Yield_,P.Dividend_,P.Managers_,P.Fees_,P.FundName_" +
		               " from PerformanceData P where  P.volatilerank_ >= '" + risk1 + "' and P.volatilerank_ <= '" + risk2 + "'";





		
			 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(performancestr);
			for (Map<String,Object> row : rows) {
				jPerformanceData data = new jPerformanceData();
				
				
			
				data.setSymID((String)row.get("SymID"));
				
				   buildstr+= data + " ";
				   jlist.add(buildstr);

                   

				
				
				
			
	        
				
				
			}
			
			
			//jPerformDataEnum jdata = new jPerformDataEnum(buildstr, new Char[] {' ',','}); 
			
			Iterator<String> forList =  jlist.iterator();
			
			
			
			
			
			return forList;
			
			
		}
		  
	  
	  
	  
public	  String buildStrIDX() {
		
			
			SimpleDateFormat SDF = new SimpleDateFormat("yy-MM-dd");
	 		String jsonstr = "";
			String symbolstr = "select * from  PerformanceCalander where symbol_ like '^%'";
			 


		
			 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(symbolstr);
			for (Map<String,Object> row : rows) {
				jPerfCalender cal = new jPerfCalender();
				
				
				
				//cal.setDate((Date)row.get("Year_"));
				cal.setSymbol((String)row.get("Symbol_"));
				cal.setNavPS((Double)row.get("NavPS_"));
				
				
				

				try {
					
					cal.setDate(SDF.parse((String)row.get("Year_")));
					
					
				}
				catch(Exception ex) {
					
					ex.printStackTrace();
				}
					
				
				
				
						
				
				
				
				jsonstr += cal.toString();
	          jsonstr += ",";

				
				
			}
			
			return jsonstr;
			
			
		} 
	  
	  
	  
 public String buildStrIDXSpinner()
	    {
		
			
			 String jsonstr = "";
			

	            String symbolstr = "select * from Idx";


		
			 List <Map <String,Object>> rows = getJdbcTemplate().queryForList(symbolstr);
			for (Map<String,Object> row : rows) {
				jIndexes index  = new jIndexes();
				
				
				
				
				index.setSymbol((String)row.get("Symbol"));
				index.setFullName((String)row.get("FullName"));
				
				
						
				
				
				
				jsonstr += index.toString();
				jsonstr += ",";

				
				
			}
			
			return jsonstr;
			
			
		}
	  
	  
	  
	  
	  
	  
	 
	 
	
	
	
}
