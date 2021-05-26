package com.vj.cabBookingApplication.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vj.cabBookingApplication.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
