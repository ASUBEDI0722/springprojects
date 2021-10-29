package com.ektha.app.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Customer;
import com.ektha.app.repository.CustomerRepository;

@Repository
public class CustomerDAO implements ICustomerDAO {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer addCustomer(Customer customer) {
		return customerRepository.save(customer);
	}

	@Override
	public List<Customer> findAllCustomers() {
		System.out.println(customerRepository.findAll());
		return customerRepository.findAll();
	}

	@Override
	public void deleteCustomer(int customerId) {
		customerRepository.deleteById(customerId);

	}

	@Override
	public Customer updateCustomerDetails(int customerId, Customer customer) {

		Customer customer1 = customerRepository.getById(customerId);
		customer1.setFirstName(customer.getFirstName());
		customer1.setLastName(customer.getLastName());
		customer1.setPhoneNumber(customer.getPhoneNumber());

		return customerRepository.save(customer1);
	}

}
