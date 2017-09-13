package com.charlie1.controller;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.charlie1.funds.model.selectFundsAll;
import com.charlie1.funds.model.selectFundsByFund;
import com.charlie1.funds.model.selectFundsByRisk;
import com.charlie1.funds.model.selectRisk;


@Controller
@RequestMapping("/rest/SelectCatFunds")
public class SymListCatController {
	
	
	@RequestMapping(value = "{category}", method = RequestMethod.GET)
	String getCatFundsData(@PathVariable String category , ModelMap model) {
	
	
	
		
		
		
		    String sym ="";
		    String fundname ="";
		    String jsonstr="";
		    String jsonsim="";
		    String jsonname="";
		    String jsonpost="";
		    String jsoncomma="";
	        
		    
		    
		  
	/*	    

			JSONObject jsonObj = new JSONObject(category);
	        String risk1 = jsonObj.getString("risk1");
	        String risk2 = jsonObj.getString("risk2");
	        selectRisk thefunds = new selectRisk(risk1,risk2);
	        
	        String strRisk = thefunds.getjsonStr();
		    
		   	        
	       
	        
	       
	        
			
	        
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
	        
	        
	       
		        
		        
	        
	        
	        strRisk = jsonstr; 
	        
	        
	        */
		    String strRisk = category;
		    
		    model.addAttribute("symbolList",strRisk);
		
			return "searchpage";

		}
		
	}


		
		
		
		
		
		
		
		


