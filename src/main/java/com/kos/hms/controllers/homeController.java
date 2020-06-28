package com.kos.hms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kos.hms.dao.userRepository;
import com.kos.hms.models.User;

@RestController("/")
public class homeController {
	
	private User user;
	
	public void setUser(User user) {
		this.user = user;
	}

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
		switch(user.getRoles()) {
		case "Receptionist":
			mv.setViewName("indexR.jsp");
			return mv;
		case "Pharmacist":
			mv.setViewName("indexP.jsp");
			return mv;
		case "Diagnostic":
			mv.setViewName("indexD.jsp");
			return mv;
		}
		mv.setViewName("login.jsp");
		return mv;
	}
	
}
