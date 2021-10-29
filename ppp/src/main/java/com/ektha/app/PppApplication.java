package com.ektha.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ektha.app.di.Car;
import com.ektha.app.service.CustomerService;

@SpringBootApplication
public class PppApplication implements CommandLineRunner {

	@Autowired
	private Car car;

	public static void main(String[] args) {
		SpringApplication.run(PppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println(car.hasEngine());

	}

}
