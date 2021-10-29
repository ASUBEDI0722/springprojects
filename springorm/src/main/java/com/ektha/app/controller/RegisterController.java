package com.ektha.app.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ektha.app.model.User;

@Controller
public class RegisterController {

	private Logger logger = LoggerFactory.getLogger(RegisterController.class);

	@RequestMapping(value = "/registerprocess", method = RequestMethod.GET)
	public String showRegisterView(ModelMap modelMap) {
//		logger.info("****showRegisterView()****");
//		System.out.println("********showRegisterView()****");
		modelMap.addAttribute("user", new User());
		return "register";
	}

	@RequestMapping(value = "/registerprocess", method = RequestMethod.POST)
	public String handleRegisterReq(User user) {

//		logger.info("****showRegisterReq()****");

//		System.out.println("****handleRegisterReq()****");
		System.out.println(user);
		return "success";
	}

}
