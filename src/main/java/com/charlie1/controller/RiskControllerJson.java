package com.charlie1.controller;

import java.util.concurrent.atomic.AtomicLong;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestParam;
	import org.springframework.web.bind.annotation.RestController;
	
	import com.charlie1.funds.model.jRisk;


@RestController
public class RiskControllerJson {
	
	
	

	    private static final String template = "Hello, %s!";
	    private final AtomicLong counter = new AtomicLong();

	    @RequestMapping("/rest/apiCharlie1")
	    public jRisk getRisk(@RequestParam(value="name", defaultValue="World") String name) {
	        return new jRisk("Charlie1",String.format(template, name));
	    }
	}
	
	
	
	
	
	


