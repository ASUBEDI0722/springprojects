package com.ektha.app.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ektha.app.dao.IProductDAO;
import com.ektha.app.entity.Product;

@Controller
public class ProductSearchController {

	@Autowired
	private IProductDAO productDAO;

	@RequestMapping("/searchproduct")
	public ModelAndView procesSearchRequest(HttpServletRequest request) {

		int pid = Integer.parseInt(request.getParameter("productid"));

		Product product = productDAO.findById(pid);

		ModelAndView modelAndView = new ModelAndView("productview");

		modelAndView.addObject("pt", product);
		return modelAndView;

	}

	@RequestMapping("/allproducts")
	public ModelAndView findAllProducts() {
		List<Product> products = productDAO.findALl();

		ModelAndView modelAndView = new ModelAndView("productsList");
		modelAndView.addObject("products", products);
		return modelAndView;

	}
	
	
//	@RequestMapping("/allproducts")
//	public String findAllProducts(Model model) {
//		List<Product> products = productDAO.findALl();
//		model.addAttribute("products", products);
//		return  "productsList";
//	
//
//	}

}
