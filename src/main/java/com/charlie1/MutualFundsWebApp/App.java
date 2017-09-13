package com.charlie1.MutualFundsWebApp;


import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.json.JSONArray;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import com.charlie1.controller.JSONArray;
import com.charlie1.funds.dao.FundsDAO;
import com.charlie1.funds.model.jPerformanceData;
import com.charlie1.funds.model.selectFundsAll;
import com.charlie1.funds.model.selectFundsByRisk;
import com.charlie1.funds.model.selectRisk;
import com.charlie1.funds.model.selectFundsByFund;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        String name = "{'risk1': '1', 'risk2': '4'}";
        
        
        String risk = "1";
        
        String cat="";
    	
    	if(risk == "1") {
    		
    		cat = "{'risk1':'1','risk2':'4'}";
    		
    	}else if(risk == "2"){
    		
    		cat = "{'risk1':'4','risk2':'8'}";
    		
    	}else if(risk == "3") {
    		
    		cat = "{'risk1':'8','risk2':'10'}";
    		
    		
    	}
        
    	
  //  	JSONObject jsonObj = new JSONObject(name);
  //      String risk1 = jsonObj.getString("risk1");
  //      String risk2 = jsonObj.getString("risk2");
        
        
   /*
        String name = "{'Risk1': '1', 'Risk2': '4'}";
        
          
        
        JSONObject jsonObj = new JSONObject(name);
        String risk1 = jsonObj.getString("Risk1");
        String risk2 = jsonObj.getString("Risk2");
        selectFundsByRisk risk = new selectFundsByRisk(risk1,risk2);
        
        String strRisk = risk.getjsonStr();
     */
        
    /*  
        String fundtmp = "{'Fund': 'PGMIX'}";
        JSONObject jsonObj = new JSONObject(fundtmp);
        String fund = jsonObj.getString("Fund");
        selectFundsByFund thefund = new selectFundsByFund(fund);
        
        String strRisk = thefund.getjsonStr();
     */   
    /*    
        
        JSONObject jsonObject = new JSONObject(strRisk);
        
        
        JSONArray ja_dataPerformance = jsonObject.getJSONArray("Performance");




     //   for (int i = 0; i < ja_dataPerformance.length(); i++) {

            JSONObject rootObj = ja_dataPerformance.getJSONObject(0);

            String sym = rootObj.getString("symID");
            String inceptdate = rootObj.getString("inceptionDate");
            double mer = rootObj.getDouble("mer");
            double assets = rootObj.getDouble("assets");
            double rank = rootObj.getDouble("rank");
            double mstarrating= rootObj.getDouble("mstarRating");
            double stddev = rootObj.getDouble("stdDev");
            double volatilerank = rootObj.getDouble("volatileRank");
            double mstarrisk = rootObj.getDouble("mstarRisk");
            double alpha = rootObj.getDouble("alpha");
            double beta = rootObj.getDouble("beta");
            double rsquare = rootObj.getDouble("rsquared");
            String rrspel = rootObj.getString("rrspeligibility");
            String load = rootObj.getString("load");
            double maxfrontend = rootObj.getDouble("maxFrontEnd");
            double maxbackend = rootObj.getDouble("maxBackEnd");
            String salesopen = rootObj.getString("saleOpen");
            double navps = rootObj.getDouble("navPS");
            double netasset = rootObj.getDouble("netAsset");
            double yield = rootObj.getDouble("yield");
            double dividend = rootObj.getDouble("dividend");
            String manager = rootObj.getString("managers");
            double Fees = rootObj.getDouble("fees");
            String FullName = rootObj.getString("fundName");

        
    
        
        
       */
        
        
 //   String test = "{ Performance : {SymID :BTTRX, InceptionDate : 1998-02-15, MER=1.6, Assets=247.0, Rank=1.0, MstarRating=5.0, StdDev=16.0, VolatileRank=2.0, MstarRisk=3.0, Alpha=0.0, Beta=0.0, Rsquared=0.0, RRSPEligibility=yes, Load=no load, MaxBackEnd=0.0, MaxFrontEnd=0.0, SaleOpen=open, NavPS=99.0, NetAsset=0.0, Yield=4.2, Dividend=2.0, Managers=Robert Gahagan, Fees=0.7, FundName=American Century Zero Coupon 2025 Inv]}";

    
   		  		
    		//,[SymID=BTTRX, InceptionDate=1998-02-15, MER=1.6, Assets=247.0, Rank=1.0, MstarRating=5.0, StdDev=16.0, VolatileRank=2.0, MstarRisk=3.0, Alpha=0.0, Beta=0.0, Rsquared=0.0, RRSPEligibility=yes, Load=no load, MaxBackEnd=0.0, MaxFrontEnd=0.0, SaleOpen=open, NavPS=99.0, NetAsset=0.0, Yield=4.2, Dividend=2.0, Managers=Robert Gahagan, Fees=0.7, FundName=American Century Zero Coupon 2025 Inv]"
    		//,[SymID=PLGBX, InceptionDate=1978-07-15, MER=1.2, Assets=247.0, Rank=5.0, MstarRating=2.0, StdDev=16.0, VolatileRank=2.0, MstarRisk=3.0, Alpha=0.0, Beta=0.0, Rsquared=0.0, RRSPEligibility=yes, Load=no load, MaxBackEnd=0.0, MaxFrontEnd=0.0, SaleOpen=open, NavPS=29.0, NetAsset=0.0, Yield=1.0, Dividend=2.0, Managers=William A. Coleman, Fees=0.45, FundName=Vanguard Balanced Index Inv]]}";
        
//    String foo = "{foundation: 'Mozilla', model: 'box', week: 45, transport: 'car', month: 7}";
   // JSONObject jsonObjs = new JSONObject(foo);  
        
        
        
        
        
        
        
        /*
        
        JSONObject jsonObj = new JSONObject(cat);
        String risk1 = jsonObj.getString("risk1");
        String risk2 = jsonObj.getString("risk2");
        
        selectRisk selectrisk = new selectRisk(risk1,risk2);
        
	     String strRisk = selectrisk.getjsonStr();
	        
		
	        String sym ="";
		    String jsonstr="";
		    String jsonpre="";
		    String jsonpost="";
	        
	    
	        jsonpre = "{'symid':'";
	        jsonpost = "'},";
	        
	        try {
	        
	        JSONObject jsonObject = new JSONObject(strRisk);
	        
	        
	        JSONArray ja_dataPerformance = jsonObject.getJSONArray("Performance");




	      //  for (int i = 0; i < ja_dataPerformance.length(); i++) {

	            JSONObject rootObj = ja_dataPerformance.getJSONObject(0);

	            sym = rootObj.getString("SymID");
	            
	            jsonstr += jsonpre;
	            jsonstr += sym;
	            jsonstr += jsonpost; 
	            
	            
	     //   }  
	            
	            
	            if(!jsonstr.equals("")) {
	            	

	   		        StringBuilder sb = new StringBuilder(jsonstr);
	              	sb.deleteCharAt(jsonstr.length()-1);
	               	jsonstr = sb.toString();
	   		        	
	            	
	            }
	            
	             
	             
	        } catch(Exception ex) {
	        	
	        	ex.printStackTrace();
	        	
	        }
		
		
        */
        
        
/*
	    String sym ="";
	    String fundname ="";
	    String jsonstr="";
	    String jsonsim="";
	    String jsonname="";
	    String jsonpost="";
	    String jsoncomma="";
        
        
        selectFundsAll thefund = new selectFundsAll();
        
        String strRisk = thefund.getjsonStr();
        
		
        
        String header = "{\"Performance\": [";
        
        jsonsim = "{'Symid':'";
        jsonname = ",'Fundname':'";
        jsonpost = "'},";
        String footer = "]}";
        jsoncomma ="'";
        
        try {
        
        JSONObject jsonObject = new JSONObject(strRisk);
        
        
        JSONArray ja_dataPerformance = jsonObject.getJSONArray("Performance");

        int sz = ja_dataPerformance.length();
        
        jsonstr += header;


        for (int i = 0; i < ja_dataPerformance.length(); i++) {

            JSONObject rootObj = ja_dataPerformance.getJSONObject(i);

            sym = rootObj.getString("symID");
            fundname = rootObj.getString("fundName");
            
            jsonstr += jsonsim;
            jsonstr += sym;
            jsonstr += jsoncomma;
            jsonstr += jsonname;
            jsonstr += fundname;
            jsonstr += jsonpost;
            
            
          
            
            
           
        }  
             
             
        } catch(Exception ex) {
        	
        	ex.printStackTrace();
        	
        }
	
	
        if(!jsonstr.equals("")) {
        	

		        StringBuilder sb = new StringBuilder(jsonstr);
          	sb.deleteCharAt(jsonstr.length()-1);
           	jsonstr = sb.toString();
		        	
        	
        }
        
        
        
        jsonstr += footer;
        
        
       
        
        */
        
        /*
    	String sym ="";
	    String fundname ="";
	    String jsonstr="";
	    String jsonsim="";
	    String jsonname="";
	    String jsonpost="";
	    String jsoncomma="";
        
	    
	    
	  
	    

		JSONObject jsonObj = new JSONObject(cat);
        String risk1 = jsonObj.getString("risk1");
        String risk2 = jsonObj.getString("risk2");
        selectRisk thefunds = new selectRisk(risk1,risk2);
        
        String strRisk = thefunds.getjsonStr();
	    
	   	        
        String testrisk = thefunds.getjsonStr();
        
       
        
		
        
        String header = "{\"Performance\": [";
        
        jsonsim = "{'Symid':'";
        jsonname = ",'Fundname':'";
        jsonpost = "'},";
        String footer = "]}";
        jsoncomma ="'";
        
        try {
        
        JSONObject jsonObject = new JSONObject(strRisk);
        
        
        JSONArray ja_dataPerformance = jsonObject.getJSONArray("Performance");

        int sz = ja_dataPerformance.length();
        
        jsonstr += header;


        for (int i = 0; i < ja_dataPerformance.length(); i++) {

            JSONObject rootObj = ja_dataPerformance.getJSONObject(i);

            sym = rootObj.getString("SymID");
            
            fundname = rootObj.getString("FundName");
            
            jsonstr += jsonsim;
            jsonstr += sym;
            jsonstr += jsoncomma;
            jsonstr += jsonname;
            jsonstr += fundname;
            jsonstr += jsonpost;
            
            
          
            
            
           
        }  
             
             
        } catch(Exception ex) {
        	
        	ex.printStackTrace();
        	
        }
	
	
        if(!jsonstr.equals("")) {
        	

		    StringBuilder sb = new StringBuilder(jsonstr);
          	sb.deleteCharAt(jsonstr.length()-1);
           	jsonstr = sb.toString();
		        	
        	
        }
        
        
        
        jsonstr += footer;
        
        
       
	        
	        
        
        
        strRisk = jsonstr; 
        
        
        */
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
        
        
          
    
    }
    
    
        
        
        
        
        
        
        
       
        
             
        
        
    
}
