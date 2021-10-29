package com.ektha.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

	@RequestMapping("/greet")
	public @ResponseBody String getMessage() {

		return "Welcome to Spring Boot";
	}

}
