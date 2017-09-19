package com.charlie1.controller;

import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.charlie1.funds.model.selectFundsByFund;

@Controller
public class HelloController {

	@RequestMapping(value = "/rest/hello", method = RequestMethod.GET)
	public String getData(ModelMap mode) {

		//ModelAndView model = new ModelAndView("hello");
		
		
		String fundtmp = "{'Fund': 'PGMIX'}";
        JSONObject jsonObj = new JSONObject(fundtmp);
        String sfund = jsonObj.getString("Fund");
        selectFundsByFund thefund = new selectFundsByFund(sfund);
        
        String strRisk = thefund.getjsonStr();
		
		mode.addAttribute("strJson", strRisk);
		
		
	
		return "hello";

	}

}

