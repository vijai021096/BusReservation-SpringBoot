package com.vj.cabBookingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.cabBookingApplication.entity.Driver;

public interface DriverRepository extends JpaRepository<Driver, Long> {

}
