package com.kos.hms.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kos.hms.dao.diagnoticRepository;
import com.kos.hms.dao.medicineInventryRepository;
import com.kos.hms.dao.patientRepository;
import com.kos.hms.dao.pharmacistRepository;
import com.kos.hms.dao.testRepository;
import com.kos.hms.models.Diagnostic;
import com.kos.hms.models.MedicineInventry;
import com.kos.hms.models.Patients;
import com.kos.hms.models.Pharmacist;
import com.kos.hms.models.Test;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

@RestController
public class patientController {

	@Autowired
	private patientRepository patientRepo;
	@Autowired
	private diagnoticRepository diRepository;
	@Autowired
	private pharmacistRepository phRepository;
	@Autowired
	private testRepository tRepository;
	@Autowired
	private medicineInventryRepository miRepository;
	private Patients patient = new Patients();
	
	//To View all the Patients in the database
	@GetMapping("/patient")
	public ModelAndView getpatient() {
		ModelAndView mv =new ModelAndView(); 
		List<Patients> p = patientRepo.findAll();
		mv.addObject("p", p);
		mv.setViewName("indexR.jsp");
		return mv;
	}
	
	//*******************Add Record************************
	
	//To redirect the request to the addPatient page
		@GetMapping("/add")
		public ModelAndView add() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("addPatient.jsp");
			return mv;
		}
	
	//To register the patient to the database
	@PostMapping("/patient")
	public ModelAndView postPatient(@ModelAttribute("Patient") Patients p ) {
		ModelAndView mv = new ModelAndView();
		System.out.println(p);
		patientRepo.save(p);
		mv.addObject("message", "Patient Registerd...!!");
		mv.setViewName("indexR.jsp");
		return mv;
	}
	
	//*******************Delete Record************************
	//To redirect the request to the deletePatient page
	@GetMapping("/delete")
	public ModelAndView delete() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("deletePatient.jsp");
		return mv;
	}
	
	//To delete record from the database
	@DeleteMapping("/delete")
	public ModelAndView deletePatient(@RequestParam("id")int id) {
		ModelAndView mv = new ModelAndView();
		if (patientRepo.existsById(id)) {
			patientRepo.deleteById(id);
			mv.addObject("message", "Record Deleted Successfully..!");
			mv.setViewName("deletePatient.jsp");
			return mv;

		}else {
			mv.addObject("er_message", "No record found..!!");
			mv.setViewName("deletePatient.jsp");
			return mv;

		}		
	}
	
	//*******************Update Record************************
	
		//To redirect the request to the updatePatient page
			@GetMapping("/update")
			public ModelAndView update() {
				ModelAndView mv = new ModelAndView();
				mv.setViewName("updatePatient.jsp");
				return mv;
			}
		
		//To update the patient to the database
		@PutMapping("/update")
		public ModelAndView updatePatient(@ModelAttribute("Patient") Patients p ) {
			ModelAndView mv = new ModelAndView();
			if(patientRepo.existsByPatientSSNID(p.getPatientSSNID())) {
				patientRepo.save(p);
				mv.addObject("message", "Patient Registerd...!!");
				mv.setViewName("updatePatient.jsp");
				return mv;
			}else {
				mv.addObject("er_message", "No record found..!!");
				mv.setViewName("updatePatient.jsp");
				return mv;

			}	
		}
		
	//*******************Billing****************************
		//Diagnostic for test
		//Pharmacist for medicines
		
		//To redirect the request to the billPatient page
		@GetMapping("/bill")
		public ModelAndView bill() {
			ModelAndView mv = new ModelAndView();
			mv.setViewName("billPatient.jsp");
			return mv;
		}
		
		@PostMapping("/bill")
		public ModelAndView billPatient(@RequestParam("id")int id) {
			ModelAndView mv = new ModelAndView();
			if(patientRepo.existsById(id)) {
				double dtotal=0.0,ptotal=0.0;
				List<Diagnostic> dlist = diRepository.findByPatientId(id);
				List<Pharmacist> plist = phRepository.findByPatientId(id);
				
				for(Diagnostic d :dlist) {
					Test t = tRepository.findById(d.getTestId()).get(); 
					dtotal += t.getPrice();
				}
				
				for(Pharmacist p :plist) {
					MedicineInventry m = miRepository.findById(p.getMedicineId()).get(); 
					ptotal += (m.getPrice() * p.getQuantity());
				}
				mv.addObject("dlist", dlist);
				mv.addObject("plist", plist);
				mv.setViewName("billPatient.jsp");
				return mv;
			}else {
				mv.addObject("er_message", "No record found..!!");
				mv.setViewName("billPatient.jsp");
				return mv;
			}
		}
}
