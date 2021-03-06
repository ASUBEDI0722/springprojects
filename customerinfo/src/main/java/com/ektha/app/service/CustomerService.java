package com.ektha.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.dao.ICustomerDAO;
import com.ektha.app.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private ICustomerDAO customerDAO;

	public Customer addCustomer(Customer customer) {
		return customerDAO.addCustomer(customer);

	}

	public List<Customer> findAllCustomer() {
		return customerDAO.findAllCustomers();
	}

	public void deleteCustomer(int customerId) {
		 customerDAO.deleteCustomer(customerId);
	}

	public Customer updateCustomerDetails( int customerId, Customer customer) {
		return customerDAO.updateCustomerDetails(customerId, customer);
	}

}
