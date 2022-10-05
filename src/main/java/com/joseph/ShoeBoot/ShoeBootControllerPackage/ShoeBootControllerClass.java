package com.joseph.ShoeBoot.ShoeBootControllerPackage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShoeBootControllerClass {
	@RequestMapping("hello")
	@ResponseBody
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping("sayHello")
	public String helloJSP() {
		return "sayHello";
	}
}
