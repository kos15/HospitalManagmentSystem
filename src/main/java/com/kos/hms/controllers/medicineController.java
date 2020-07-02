package com.kos.hms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.kos.hms.dao.medicineInventryRepository;
import com.kos.hms.dao.pharmacistRepository;
import com.kos.hms.models.MedicineInventry;
import com.kos.hms.models.Pharmacist;

@RestController
public class medicineController {

	@Autowired
	private medicineInventryRepository miRepository;
	@Autowired
	private pharmacistRepository phRepository;

	@GetMapping("/addMedicineByName")
	public ModelAndView addMedicine(@RequestParam(name = "name") String name, @RequestParam(name = "id") int id,
			@RequestParam(name = "quantity") int quantity) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("addMedicine.jsp");
		if (miRepository.existsByMedicineName(name)) {
			MedicineInventry mi = miRepository.findByMedicineName(name);
			if (mi.getQuantity() >= quantity) {
				phRepository.save(new Pharmacist(id, mi.getMedicineId(), quantity));
				mi.setQuantity(mi.getQuantity() - quantity);
				miRepository.save(mi);
			} else {
				mv.addObject("er_messgae", "Too much quantity");
				return mv;
			}
			mv.addObject("message", "Medicine added");
			return mv;
		} else {
			mv.addObject("er_messgae", "No Medicine found");
			return mv;
		}
	}

}
