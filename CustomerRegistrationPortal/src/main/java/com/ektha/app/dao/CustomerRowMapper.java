package com.ektha.app.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ektha.app.entity.Address;
import com.ektha.app.entity.Customer;

@Component("customerRowMapper")
public class CustomerRowMapper implements RowMapper<Customer> {

	@Override
	public Customer mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Address address = new Address();
		address.setAddressLine1(resultSet.getString("addressLine1"));
		address.setAddressLine2(resultSet.getString("addressLine2"));
		address.setCity(resultSet.getString("city"));
		address.setState(resultSet.getString("state"));
		address.setZipCode(resultSet.getInt("zipcode"));
//		address.setCustomerId(resultSet.getInt("customerId"));

		Customer customer = new Customer();
		customer.setFirstName(resultSet.getString("firstName"));
		customer.setLastName(resultSet.getString("lastName"));
		customer.setPhoneNumber(resultSet.getString("phoneNumber"));
		customer.setEmail(resultSet.getString("email"));

		customer.setAddress(address);

		return customer;
	}

}
