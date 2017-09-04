package com.charlie1.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
	
	import com.charlie1.funds.model.jRisk;

@RequestMapping("/rest/apiCharlie1")
@RestController
public class RiskControllerJson {
	
	
	

	    private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    
	   
		@RequestMapping(value = "{name}", method = RequestMethod.GET)
		public @ResponseBody
		jRisk getTestJSON(@PathVariable String name) {
			
	    
	    
	    //public jRisk getRisk(@RequestParam(value="{name}", defaultValue="World") String name) {
	        
	    	
	    	
	    	
	    	
	    	return new jRisk("Charlie1",String.format(template, name));
	    }
	}
	
	
	
	
	
	


