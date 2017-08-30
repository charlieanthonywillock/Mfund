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
import com.charlie1.funds.model.selectFundsByRisk;
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
        
   
   /*
        String name = "{'Risk1': '1', 'Risk2': '4'}";
        
          
        
        JSONObject jsonObj = new JSONObject(name);
        String risk1 = jsonObj.getString("Risk1");
        String risk2 = jsonObj.getString("Risk2");
        selectFundsByRisk risk = new selectFundsByRisk(risk1,risk2);
        
        String strRisk = risk.getjsonStr();
     */
        
      
        String fundtmp = "{'Fund': 'PGMIX'}";
        JSONObject jsonObj = new JSONObject(fundtmp);
        String fund = jsonObj.getString("Fund");
        selectFundsByFund thefund = new selectFundsByFund(fund);
        
        String strRisk = thefund.getjsonStr();
        
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
          
    
    }
    
    
        
        
        
        
        
        
        
       
        
             
        
        
    
}
