package com.charlie1.controller;

	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.ResponseBody;

	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.charlie1.funds.dao.FundsDAO;
	import com.charlie1.funds.model.Shop;
	import com.charlie1.funds.model.selectRisk;
	import com.charlie1.funds.model.jRisk;

	import org.json.JSONArray;
	import org.json.JSONObject;
	
	
	@Controller
	@RequestMapping("/rest/apiSelectRisk")
	
public class RiskController {
	
	
		@RequestMapping(value = "{name}", method = RequestMethod.GET)
		public @ResponseBody
		jRisk getTestJSON(@PathVariable String name) {
			
			
			// String risk1 = "1";
	        // String risk2 = "4";
	    	// String str="";
	    	 
	    	 ApplicationContext context = 
	         		new ClassPathXmlApplicationContext("Spring-Module.xml");
	    	 
	    	 
	    	// FundsDAO customerDAO = (FundsDAO) context.getBean("FundsDAO");
	        // str =  customerDAO.buildStrPeformanceData(risk1, risk2);
			
			
			JSONObject jsonObj = new JSONObject(name);
	        String risk1 = jsonObj.getString("risk1");
	        String risk2 = jsonObj.getString("risk2");
	        selectRisk selectrisk = new selectRisk(risk1,risk2);
	        
	        String strRisk = selectrisk.getjsonStr();
	        			
			jRisk jrisk = new jRisk();
			jrisk.setRisk1(strRisk);
			//jrisk.setRisk2(strRisk);
			
		
			 return jrisk;

		}
		
		
		
		
		
		
		

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


