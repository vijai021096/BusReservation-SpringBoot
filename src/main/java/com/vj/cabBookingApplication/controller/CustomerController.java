package com.vj.cabBookingApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vj.cabBookingApplication.Repository.CustomerRepository;
import com.vj.cabBookingApplication.entity.Customer;

@RestController
public class CustomerController {

	
	@Autowired
	CustomerRepository customerRepository;
	
	@GetMapping("/customers")
	public List<Customer> getCustomers(){
		return customerRepository.findAll();
	}
	
	
}
