package com.vj.cabBookingApplication.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vj.cabBookingApplication.Repository.CabRepository;
import com.vj.cabBookingApplication.entity.Cab;

@RestController
public class CabController {

	@Autowired
	CabRepository cabRepository;
	
	@GetMapping("/Availablecabs")
	public List<Cab> getAvailableCabs() {
		List<Cab> availableCabs = cabRepository.findAll();
		List<Cab>available = new ArrayList<>();
		availableCabs.stream().forEach(cabs ->{
			if(cabs.getIs_available()==1) {
				available.add(cabs);
			}
		});
		return available;
	}
	
	@GetMapping("/cabs")
	public List<Cab> getAllCabs(){
		return cabRepository.findAll();
	}
}
