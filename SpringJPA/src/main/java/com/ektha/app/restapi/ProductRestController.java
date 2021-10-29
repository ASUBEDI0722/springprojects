package com.ektha.app.restapi;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ektha.app.dto.ProductDTO;
import com.ektha.app.service.IProductService;

@RequestMapping("/products")
@RestController
public class ProductRestController {

	@Autowired
	IProductService productService;

	@GetMapping(path = "/{id}", produces = "application/json")
	public ProductDTO findById(@PathVariable("id") int id,
			@RequestParam(value = "query", required = false) String query) {

		ProductDTO productDTO = productService.findById(id);
		System.out.println(query);
		return productDTO;

	}

	@GetMapping
	public List<ProductDTO> findALl() {
		List<ProductDTO> productDTOs = productService.findAll();
		return productDTOs;
	}

	@PostMapping
	public ProductDTO add(@RequestBody ProductDTO productDTO) {
		ProductDTO productDTO2 = productService.add(productDTO);
		return productDTO2;

	}
//
//	@PostMapping(path = "/", consumes ="application/json")
//	public String add(@RequestBody Product product) {
//		if (productService.add(product)) {
//			return "product added successfully";
//		}
//		return "could not add product";
//
//	}

	@GetMapping(path = "/hello")
	public String test() {
		return "Hello World";
	}

}
//application/json/xml