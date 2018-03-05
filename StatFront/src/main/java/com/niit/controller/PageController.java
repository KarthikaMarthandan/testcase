package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController 
{
	
	@RequestMapping("/")
	public String showHomePage()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public String showLogin()
	{
		return "Login";
	}
	
	@RequestMapping("/aboutus")
	public String showAboutUs()
	{
		return "AboutUs";
	}
	
	@RequestMapping("/RegistrationForm")
	public String showRegistrationForm()
	{
		return "RegistrationForm";
	}
	
}
