package com.vj.cabBookingApplication.controller;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vj.cabBookingApplication.Repository.BusRepository;
import com.vj.cabBookingApplication.entity.Bus;
import com.vj.cabBookingApplication.service.BusService;

@RestController
public class BusController {

	@Autowired
	BusService busService;

	
	@GetMapping("/busBySrcAndDest")
	public List<Bus> getBusbySourceAnfDestination(@RequestParam String source,@RequestParam String dest){
	      return busService.getBusbySourceAnfDestination(source, dest);
		
	}
	
	@GetMapping("/busBySrcAndDestAtTime")
	public List<Bus> getBusBySrcAndDestAtTime(@RequestParam String source,@RequestParam String dest,@RequestParam Time time){
		return busService.getBusBySrcAndDestAtTime(source, dest, time);
	
	}
	
	@GetMapping("/busBySrcDestTimePrice")
	public List<Bus> filterBusByPriceSrcAndDestAtTime(@RequestParam String source,@RequestParam String dest,@RequestParam Time time,@RequestParam String price){
		return busService.filterBusByPriceSrcAndDestAtTime(source, dest, time, price);
	}
}
