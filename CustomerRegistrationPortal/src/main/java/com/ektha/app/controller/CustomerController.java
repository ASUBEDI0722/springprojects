package com.ektha.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.app.dao.ICustomerDAO;
import com.ektha.app.entity.Address;
import com.ektha.app.entity.Customer;

@Controller
public class CustomerController {

	@Autowired
	private ICustomerDAO customerDAO;

	@RequestMapping(value = "/CustomerPortal", method = RequestMethod.POST)
	public ModelAndView processSearchRequest(HttpServletRequest request) {

		String firstName = request.getParameter("fname");
		String lastName = request.getParameter("lname");
		String phoneNumber = request.getParameter("phone");
		String email = request.getParameter("email");

		String addressLine1 = request.getParameter("address1");
		String addressLine2 = request.getParameter("address2");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		int zipCode = Integer.parseInt(request.getParameter("zip"));

		Customer customer = new Customer();
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setPhoneNumber(phoneNumber);
		customer.setEmail(email);

		Address address = new Address();
		address.setAddressLine1(addressLine1);
		address.setAddressLine2(addressLine2);
		address.setCity(city);
		address.setState(state);
		address.setZipCode(zipCode);

		customer.setAddress(address);

		customerDAO.addCustomer(customer);

		List<Customer> c = customerDAO.findAll();

		ModelAndView modelAndView = new ModelAndView("view");

		modelAndView.addObject("customer", customer);
		return modelAndView;

	}
}
