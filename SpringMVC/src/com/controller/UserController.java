package com.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bean.Employee;
import com.bean.User;


@Controller
@RequestMapping("/users")
public class UserController {
	@RequestMapping(value="/add",method=RequestMethod.GET)
	public String helloUser1(Model m)
	{
		m.addAttribute("u",new User());
		return "User";
	}
	@RequestMapping(value="/adduser",method=RequestMethod.GET)
	public String helloUser(@Valid @ModelAttribute("u")User u, BindingResult result)
	{
		if(result.hasErrors())
			return "User";
		else
			return "welcome";
	}
}
