package com.ektha.app.service;

import org.springframework.stereotype.Service;

import com.ektha.app.repository.ICustomer;

@Service
public class CustomerService implements ICustomer {

	@Override
	public int addNumber(int a, int b) {
		return a + b;
	}
}
