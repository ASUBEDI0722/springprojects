package com.ektha.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.ektha.app.client.ICustomerService;
import com.ektha.app.dto.CustomerDTO;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class CustomerclientApplication implements CommandLineRunner {

	@Autowired
	private ICustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(CustomerclientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		CustomerDTO customerDTO = customerService.findCustomer(1);
		System.out.println(customerDTO);
	}

}
