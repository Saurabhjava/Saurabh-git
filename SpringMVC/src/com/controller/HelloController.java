package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/yamaha")
public class HelloController {
	@RequestMapping("/Hello")
	public @ResponseBody String sayHello()
	{
		return "<html><body><h1>Hello! Spring MVC FirstExample</h1></body></html>";
	}
	@RequestMapping("/xyz")
	public @ResponseBody String sayHello1()
	{
		return "Hello! Java Champ..";
	}
}
