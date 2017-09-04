package com.charlie1.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
	
	import com.charlie1.funds.model.jRisk;
import com.charlie1.funds.model.selectFundsByFund;
import com.charlie1.funds.model.selectFundsByRisk;

@RequestMapping("/rest/apiCharlie1")
@RestController
public class RiskControllerJson {
	
	
	
	    String sym ="";
	    String jsonstr="";
	    String jsonpre="";
	    String jsonpost="";
	   
		@RequestMapping(value = "{fund}", method = RequestMethod.GET)
		public @ResponseBody
		jRisk getTestJSON(@PathVariable String fund) {
			
	    
			
			 JSONObject jsonObj = new JSONObject(fund);
					
			 String risk1 = jsonObj.getString("risk1");
		     String risk2 = jsonObj.getString("risk2");
		     selectFundsByRisk fundsByRisk = new selectFundsByRisk(risk1,risk2);
		        
		     String strRisk = fundsByRisk.getjsonStr();
		        
			
					
		        
		    
		        jsonpre = "{'symid':'";
		        jsonpost = "'},";
		        
		        try {
		        
		        JSONObject jsonObject = new JSONObject(strRisk);
		        
		        
		        JSONArray ja_dataPerformance = jsonObject.getJSONArray("Performance");




		      //  for (int i = 0; i < ja_dataPerformance.length(); i++) {

		            JSONObject rootObj = ja_dataPerformance.getJSONObject(0);

		            sym = rootObj.getString("symID");
		            
		            jsonstr += jsonpre;
		            jsonstr += sym;
		            jsonstr += jsonpost; 
		            
		            
		     //   }  
		             
		             
		        } catch(Exception ex) {
		        	
		        	ex.printStackTrace();
		        	
		        }
			
			
			
			
			
		        StringBuilder sb = new StringBuilder(jsonstr);
            	sb.deleteCharAt(jsonstr.length()-1);
            	jsonstr = sb.toString();
			
			    
			
			
			
			
			
			
	    
	    //public jRisk getRisk(@RequestParam(value="{name}", defaultValue="World") String name) {
	        
	    	
	    	jRisk jrisk = new jRisk();
	    	
	    	jrisk.setRisk1(jsonstr);
	    	//jrisk.setRisk2("charlie2");
	    	
	    	
	    //	return new jRisk("Charlie1",String.format(template, name));
	    	
	    	return jrisk;
	    	
	    }
	}
	
	
	
	
	
	


