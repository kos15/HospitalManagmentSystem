package com.kos.hms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kos.hms.dao.diagnoticRepository;
import com.kos.hms.dao.testRepository;
import com.kos.hms.models.Diagnostic;
import com.kos.hms.models.Test;

@RestController
public class testController {
	@Autowired
	private testRepository tRepo;
	@Autowired
	private diagnoticRepository dRepo;
	
	@GetMapping("/addTestByName")
	public  ModelAndView addByname(@RequestParam(name="name")String testName,@RequestParam(name="id")int id){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addDiagnostic.jsp");
		if(tRepo.existsByTestName(testName)) {
			Test t = tRepo.findByTestName(testName);
			dRepo.save(new Diagnostic(id,t.getTestId()));
			mv.addObject("message", "Test added ");
			return mv;
		}else {
			mv.addObject("er_messgae", "No Test found");
			return mv;
		}
	}

}
