package com.ektha.app.controller;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.app.entity.Customer;
import com.ektha.app.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customerinfo")
public class CustomerController {

	@Autowired
	private CustomerService customerService;

	@RolesAllowed({ "user" })
	@PostMapping("/addCustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);

	}

	@RolesAllowed({ "admin", "user" })
	@GetMapping
	public List<Customer> findAllCustomer() {
		return customerService.findAllCustomer();
	}

	@RolesAllowed("admin")
	@DeleteMapping("/deleteCustomer/{customerId}")
	public void deleteCustomer(@PathVariable int customerId) {
		customerService.deleteCustomer(customerId);

	}

	@RolesAllowed("admin")
	@PutMapping("/updateCustomer/{customerId}")
	public Customer updateCustomerDetails(@PathVariable int customerId, @RequestBody Customer customer) {

		return customerService.updateCustomerDetails(customerId, customer);
	}

}
