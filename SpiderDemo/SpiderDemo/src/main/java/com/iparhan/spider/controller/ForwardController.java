package com.iparhan.spider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ForwardController {
	
	@RequestMapping(value ="/")
	public String forward(){
		return "index";
	}

}
