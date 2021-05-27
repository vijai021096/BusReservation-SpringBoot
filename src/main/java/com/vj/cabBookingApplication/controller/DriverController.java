package com.vj.cabBookingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vj.cabBookingApplication.Repository.DriverRepository;
import com.vj.cabBookingApplication.entity.Driver;

@RestController
public class DriverController {

	@Autowired
	DriverRepository driverRepository;
	
	@GetMapping("/drivers")
	public List<Driver> getDrivers(){
		return driverRepository.findAll();
	}
}
