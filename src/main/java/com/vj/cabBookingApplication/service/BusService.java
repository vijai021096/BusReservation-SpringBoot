package com.vj.cabBookingApplication.service;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.vj.cabBookingApplication.Repository.BusRepository;
import com.vj.cabBookingApplication.entity.Bus;

@Service
public class BusService {

	@Autowired
	BusRepository busRepository;
	
	public List<Bus> getBusbySourceAnfDestination(@RequestParam String source,@RequestParam String dest){
		 List<Bus> busList = new ArrayList<>();
	      busRepository.findAll().forEach(bus->{
	    	  if(bus.getSource().equals(source) && bus.getDestination().equals(dest)) {
	    		  busList.add(bus);
	    	  }
	      });
	      return busList;
		
	}
	
	public List<Bus> getBusBySrcAndDestAtTime(@RequestParam String source,@RequestParam String dest,@RequestParam Time time){
		List<Bus> busList = new ArrayList<>();
	busList =getBusbySourceAnfDestination(source, dest);
	return busList.stream().filter(bus ->
		bus.getTime().equals(time)).collect(Collectors.toList());

	}

	public List<Bus> filterBusByPriceSrcAndDestAtTime(@RequestParam String source,@RequestParam String dest,@RequestParam Time time,@RequestParam String price){
		List<Bus> busList = new ArrayList<>();
		busList=getBusBySrcAndDestAtTime(source, dest, time);
		return busList.stream().filter(bus-> 
		bus.getPrice().compareTo(price)>=1).collect(Collectors.toList());
	}
}
