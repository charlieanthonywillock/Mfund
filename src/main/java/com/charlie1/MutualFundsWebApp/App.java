package com.charlie1.MutualFundsWebApp;


import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
        
      /*
        String fundtmp = "{'Fund': 'PGMIX'}";
        JSONObject jsonObj = new JSONObject(fundtmp);
        String fund = jsonObj.getString("Fund");
        selectFundsByFund thefund = new selectFundsByFund(fund);
        
        String strRisk = thefund.getjsonStr();
       */ 
        
             
        
        
    }
}
