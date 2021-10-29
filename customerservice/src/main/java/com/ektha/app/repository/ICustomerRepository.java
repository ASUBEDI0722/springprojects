package com.ektha.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ektha.app.entity.Customer;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {

}
