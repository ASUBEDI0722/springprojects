package com.ektha.app.dao;

import java.util.List;

import com.ektha.app.entity.Customer;

public interface ICustomerDAO {
	
	public Customer addCustomer(Customer customer);

	public List<Customer> findAllCustomers();

	public void deleteCustomer(int customerId);

	public Customer updateCustomerDetails(int customerId, Customer customer);

}
