package com.ektha.app.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ektha.app.dto.CustomerDTO;
import com.ektha.app.entity.Customer;

public interface ICustomerService extends JpaRepository<Customer, Integer> {
	
	CustomerDTO findById(int id);

}
