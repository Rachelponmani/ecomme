package com.niit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController 
  {
	@RequestMapping("/")
	public String index()
	{
		return "index";
	}
	@RequestMapping("/aboutus")
	public String gotoAboutus()
	{
		System.out.println("hello");
		return "aboutus";
	}
	@RequestMapping("/register")
	public String gotoRegister()
	{
		System.out.println("register successfully");
		return "register";
	}
	@RequestMapping("/login")
	public String gotoLogin()
	{
		return "login";
	}
	@RequestMapping("/rose")
	public String gotoRose()
	{
		return "rose";
		
	}
	
	

}
