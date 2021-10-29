package com.ektha.app;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ektha.app.dao.IProductDAO;
//import com.ektha.app.dao.IProductDAO;
import com.ektha.app.entity.Product;
import com.ektha.app.repository.IProductRepository;

@SpringBootApplication
public class SpringJpaApplication implements CommandLineRunner {

	@Autowired
	private IProductDAO productDAO;
//	private IProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Product> products = productDAO.findAll();

		for (Product product : products) {
			System.out.println(product);
		}
	}

}
