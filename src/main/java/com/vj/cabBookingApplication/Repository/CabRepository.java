package com.vj.cabBookingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.cabBookingApplication.entity.Cab;

public interface CabRepository extends JpaRepository<Cab, Long> {

}
