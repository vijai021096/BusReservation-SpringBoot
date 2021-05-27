package com.vj.cabBookingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.cabBookingApplication.entity.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {

}
