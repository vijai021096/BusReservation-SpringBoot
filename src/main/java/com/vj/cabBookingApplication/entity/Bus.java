package com.vj.cabBookingApplication.entity;

import java.sql.Time;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="cabs")
public class Bus {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long busId;
	
	private int numOfSeats;
	
	private String Source;
	
	private String destination;
	
	private Time time;
	
	private String busType;
	
	private String price;
	
	private String AcOrNonAc;

	@OneToOne(mappedBy = "bus",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnoreProperties("bus")
	private Driver driver;

	public long getBusId() {
		return busId;
	}

	public void setBusId(long busId) {
		this.busId = busId;
	}

	public int getNumOfSeats() {
		return numOfSeats;
	}

	public void setNumOfSeats(int numOfSeats) {
		this.numOfSeats = numOfSeats;
	}

	public String getSource() {
		return Source;
	}

	public void setSource(String source) {
		Source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Driver getDriver() {
		return driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getAcOrNonAc() {
		return AcOrNonAc;
	}

	public void setAcOrNonAc(String acOrNonAc) {
		AcOrNonAc = acOrNonAc;
	}

	
	
	
	
	
}
