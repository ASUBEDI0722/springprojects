package com.ektha.app.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.app.dto.CustomerDTO;
import com.ektha.app.service.ICustomerService;

@RequestMapping("/customers")
@RestController
public class CustomerRestController {
	
	@Autowired
	private ICustomerService customerService;
	
	@GetMapping("/{id}")
	public CustomerDTO findById(@PathVariable("id")int id) {
		
		CustomerDTO customerDTO = new CustomerDTO();
		return customerDTO;
	}

}
