package com.ektha.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Customer;

@Repository
public class CustomerDAO implements ICustomerDAO {

	private static String SQL_INSERT_CUSTOMER = "insert into customerportal.customer(firstName, lastName, phoneNumber, email) values(?,?,?,?)";

	private static String SQL_INSERT_ADDRESS = "insert into customerportal.address(addressLine1, addressLine2, city, state, zipcode, customerId) values(?,?,?,?,?,?)";

	private static String SQL_SELECT = " select AddressLine1, AddressLine2, city,state, ZipCode, FirstName, LastName, phoneNumber, email from customerportal.address a right join customerportal.customer c on  a.customerId = c.CustomerId";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private CustomerRowMapper customerRowMapper;

	@Override
	public void addCustomer(Customer customer) {

		KeyHolder holder = new GeneratedKeyHolder();

		jdbcTemplate.update(new PreparedStatementCreator() {

			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {

				PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT_CUSTOMER,
						new String[] { "customerId" });

				preparedStatement.setString(1, customer.getFirstName());
				preparedStatement.setString(2, customer.getLastName());
				preparedStatement.setString(3, customer.getPhoneNumber());
				preparedStatement.setString(4, customer.getEmail());

				return preparedStatement;

			}

		}, holder);

		int customer_Id = holder.getKey().intValue();

		int rows = jdbcTemplate.update(SQL_INSERT_ADDRESS, customer.getAddress().getAddressLine1(),
				customer.getAddress().getAddressLine2(), customer.getAddress().getCity(),
				customer.getAddress().getState(), customer.getAddress().getZipCode(), customer_Id);

	}

	@Override
	public List<Customer> findAll() {
		List<Customer> customers = jdbcTemplate.query(SQL_SELECT, customerRowMapper);

		return customers;
	}

//	@Override
//	public Customer findCustomer() {
//		Customer customer = jdbcTemplate.queryForObject(SQL_SELECT, customerRowMapper);
//		
//		return customer;
//	}

}
