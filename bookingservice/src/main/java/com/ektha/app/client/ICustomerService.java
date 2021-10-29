package com.ektha.app.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;

import com.ektha.app.dto.CustomerDTO;

@FeignClient(name="customerservice")
public interface ICustomerService {

	CustomerDTO findCustomer(@PathVariable ("id") int id);
	
}
