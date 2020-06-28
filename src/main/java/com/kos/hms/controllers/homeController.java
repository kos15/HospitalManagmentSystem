package com.kos.hms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kos.hms.dao.userRepository;

@RestController("/")
public class homeController {

	@Autowired
	private userRepository ur;
	
	@GetMapping("login")
	public ModelAndView login() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("login.jsp");
		return mv;
	}
	
	@GetMapping()
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index.jsp");
		return mv;
	}
	
}
