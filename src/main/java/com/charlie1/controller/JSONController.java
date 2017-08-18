package com.charlie1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.charlie1.funds.model.jRisk;

@Controller
@RequestMapping("apiSelectFundsByRisk/")
public class JSONController {

	@RequestMapping(value = "{json}", method = RequestMethod.GET)
	public @ResponseBody
	jRisk getStringJSON(@PathVariable String json) {

		jRisk jrisk = new jRisk();
		jrisk.setRisk1(json);
		
		//jrisk(new String[] { "mkyong1", "mkyong2" });

		return jrisk;

	}

}
