package com.charlie1.controller;




import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
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
import com.fasterxml.jackson.databind.ObjectMapper;

//import com.charlie1.funds.model.jRisk;
//import com.charlie1.funds.model.selectFundsByFund;
import com.charlie1.funds.model.selectFundsAll;
import com.charlie1.funds.model.selectFundsByFund;








@Controller
@RequestMapping("/rest/SelectFundsAll")
public class SymListController {
	
	
	//@RequestMapping(value = "{fund}", method = RequestMethod.GET)
	String getPerfData(ModelMap model) {
		
		
	
		String sym ="";
        String inceptdate ="";
        double mer =0;
        double assets=0;
        double rank =0;
        double mstarrating=0;
        double stddev =0;
        double volatilerank =0;
        double mstarrisk =0;
        double alpha =0;
        double beta =0;
        double rsquare =0;
        String rrspel ="";
        String load ="";
        double maxfrontend =0;
        double maxbackend =0;
        String salesopen ="";
        double navps =0;
        double netasset =0;
        double yield =0;
        double dividend =0;
        String manager ="";
        double Fees =0;
        String FullName ="";
		
		
		
		
		
		
		    //String fundtmp = "{'Fund': 'PGMIX'}";
	     //   JSONObject jsonObj = new JSONObject(fund);
	     //   String sfund = jsonObj.getString("Fund");
	        selectFundsAll thefund = new selectFundsAll();
	        
	        String strRisk = thefund.getjsonStr();
	        
	        try {
	        
	        JSONObject jsonObject = new JSONObject(strRisk);
	        
	        
	        JSONArray ja_dataPerformance = jsonObject.getJSONArray("Performance");




	     //   for (int i = 0; i < ja_dataPerformance.length(); i++) {

	            JSONObject rootObj = ja_dataPerformance.getJSONObject(0);

	             sym = rootObj.getString("symID");
	             inceptdate = rootObj.getString("inceptionDate");
	             mer = rootObj.getDouble("mer");
	             assets = rootObj.getDouble("assets");
	             rank = rootObj.getDouble("rank");
	             mstarrating= rootObj.getDouble("mstarRating");
	             stddev = rootObj.getDouble("stdDev");
	             volatilerank = rootObj.getDouble("volatileRank");
	             mstarrisk = rootObj.getDouble("mstarRisk");
	             alpha = rootObj.getDouble("alpha");
	             beta = rootObj.getDouble("beta");
	             rsquare = rootObj.getDouble("rsquared");
	             rrspel = rootObj.getString("rrspeligibility");
	             load = rootObj.getString("load");
	             maxfrontend = rootObj.getDouble("maxFrontEnd");
	             maxbackend = rootObj.getDouble("maxBackEnd");
	             salesopen = rootObj.getString("saleOpen");
	             navps = rootObj.getDouble("navPS");
	             netasset = rootObj.getDouble("netAsset");
	             yield = rootObj.getDouble("yield");
	             dividend = rootObj.getDouble("dividend");
	             manager = rootObj.getString("managers");
	             Fees = rootObj.getDouble("fees");
	             FullName = rootObj.getString("fundName");
	        
	        
	        } catch(Exception ex) {
	        	
	        	ex.printStackTrace();
	        	
	        }
	        
	       
	        
	        model.addAttribute("symid",sym);
	        model.addAttribute("inceptdate",inceptdate);
	        model.addAttribute("mer",mer);
	        model.addAttribute("assets",assets);
	        model.addAttribute("rank",rank);
	        model.addAttribute("mstarrating",mstarrating);
	        model.addAttribute("stddev",stddev);
	        model.addAttribute("volatilerank",volatilerank);
	        model.addAttribute("mstarrisk",mstarrisk);
	        model.addAttribute("alpha",alpha);
	        model.addAttribute("beta",beta);
	        model.addAttribute("rrspel",rrspel);
	        model.addAttribute("load",load);
	        model.addAttribute("maxfrontend",maxfrontend);
	        model.addAttribute("maxbackend",maxbackend);
	        model.addAttribute("salesopen",salesopen);
	        model.addAttribute("navps",navps);
	        model.addAttribute("netasset",netasset);
	        model.addAttribute("yield",yield);
	        model.addAttribute("dividend",dividend);
	        model.addAttribute("manager",manager);
	        model.addAttribute("fees",Fees);
	        model.addAttribute("fullName",FullName);
	        
	        
	               
	        
	        
	        
            model.addAttribute("perfJSON",strRisk);
	
		return "FundSearch";

	}
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


