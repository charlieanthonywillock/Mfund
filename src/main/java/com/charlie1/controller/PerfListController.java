package com.charlie1.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.ui.ModelMap;

import com.charlie1.funds.model.jRisk;
import com.charlie1.funds.model.selectFundsByRisk;




@Controller
@RequestMapping("/rest/SelectFundsByRisk")
public class PerfListController  {
	
	
	@RequestMapping(value = "{name}", method = RequestMethod.GET)
	public @ResponseBody
	String getPerfData(@PathVariable String name, ModelMap model) {
		
		
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
        selectFundsByRisk fundsByRisk = new selectFundsByRisk(risk1,risk2);
        
        String strRisk = fundsByRisk.getjsonStr();
        
        
		      
         
	//	Shop shop = new Shop();
	//	shop.setName(strRisk);
		
		jRisk jrisk = new jRisk();
		jrisk.setRisk(strRisk);
		
		//shop.setStaffName(new String[] { "mkyong1", "mkyong2" });
		
		
		
		model.addAttribute("perfJSON",strRisk);
	

		
		
		

		return "list";

	}
	
	
	
	
	
	
	
}
	
	
	
	
	
