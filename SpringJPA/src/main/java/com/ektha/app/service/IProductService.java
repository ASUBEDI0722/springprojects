package com.ektha.app.service;

import java.util.List;

import com.ektha.app.dto.ProductDTO;
import com.ektha.app.entity.Product;

public interface IProductService {
	
	ProductDTO findById(int id);
	
	List<ProductDTO> findAll();
	
//	public boolean add(Product product);
	
	public ProductDTO add(ProductDTO productDTO);


}
