package com.ektha.app.dao;

import java.util.List;

import com.ektha.app.entity.Customer;

public interface ICustomerDAO {
	
	public void addCustomer(Customer customer);
	public List<Customer> findAll();
//	public Customer findCustomer();

}
