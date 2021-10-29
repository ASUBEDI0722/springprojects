package com.ektha.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.app.dao.IOrderDAO;
import com.ektha.app.entity.Order;

@Controller
public class OrderSearchController {

	@Autowired
	private IOrderDAO orderDAO;

	@RequestMapping("/searchorder")
	public ModelAndView processSearchRequest(HttpServletRequest request) {

		int oid = Integer.parseInt(request.getParameter("orderid"));

		Order order = orderDAO.findByOrderId(oid);

		ModelAndView modelAndView = new ModelAndView("orderview");
		modelAndView.addObject("order", order);
		return modelAndView;

	}

}
