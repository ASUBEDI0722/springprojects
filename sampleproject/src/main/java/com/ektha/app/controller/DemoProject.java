package com.ektha.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/get")
public class DemoProject {

	@GetMapping
	public String printHello() {
		return "Welcome to Spring Boot";
	}

}
