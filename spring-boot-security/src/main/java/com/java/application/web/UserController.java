package com.java.application.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@Autowired
	UserDetailsService userService;

	@RequestMapping(value = { "/", "/hello**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Example");
		model.addObject("message", "Welcome to India");
		model.setViewName("hello");
		return model;

	}

	@RequestMapping(value = "/admin**", method = RequestMethod.GET)
	public ModelAndView adminLogin() {
		UserDetails userDetails = userService.loadUserByUsername("admin");
		System.out.println(userDetails.getUsername());
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Boot Security");
		model.addObject("message", "Logged In User is  " + name + "!");
		model.setViewName("admin");
		return model;
	}

	@RequestMapping(value = "/superadmin**", method = RequestMethod.GET)
	public ModelAndView superAdminLogin() {
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		String name = auth.getName();
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Boot Security");
		model.addObject("message", "Logged In User is  " + name + "!");
		model.setViewName("admin");
		return model;
	}

}