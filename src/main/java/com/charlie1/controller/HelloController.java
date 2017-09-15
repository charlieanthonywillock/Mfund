package com.charlie1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

	@RequestMapping(value = "/rest/hello", method = RequestMethod.GET)
	public ModelAndView getData() {

		ModelAndView model = new ModelAndView("hello");
	
		return model;

	}

}

