package com.ektha.app.dao;

import java.util.List;
import java.util.Optional;

import com.ektha.app.entity.Product;

public interface IProductDAO {
	
	public Product findById(int id);
	public List<Product> findAll();
	public void update(Product product);
	public void delete(int id);
//	public Optional<Product> add(Product product);
	public Product add(Product product);

}
