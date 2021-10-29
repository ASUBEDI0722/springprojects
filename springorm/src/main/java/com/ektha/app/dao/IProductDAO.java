package com.ektha.app.dao;

import java.util.List;

import com.ektha.app.entity.Product;

public interface IProductDAO {

	void addProduct(Product product);

	Product findById(int id);

	List<Product> findALl();

	boolean updateProduct(Product product);

	boolean delete(int id);
	
	

}
