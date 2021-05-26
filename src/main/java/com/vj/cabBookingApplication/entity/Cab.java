package com.vj.cabBookingApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cabs")
public class Cab {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long cab_id;
	
	private String cab_model;
	
	private long driver_id;
	
	@Column(name="is_available")
	private int is_available;

	public long getCab_id() {
		return cab_id;
	}

	public void setCab_id(long cab_id) {
		this.cab_id = cab_id;
	}

	public String getCab_model() {
		return cab_model;
	}

	public void setCab_model(String cab_model) {
		this.cab_model = cab_model;
	}

	public long getDriver_id() {
		return driver_id;
	}

	public void setDriver_id(long driver_id) {
		this.driver_id = driver_id;
	}

	public int getIs_available() {
		return is_available;
	}

	public void setIs_available(int is_available) {
		this.is_available = is_available;
	}

	
	
	
	
	
}
