package com.ektha.app.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Product;

@Repository
public class ProductDAO implements IProductDAO {

	@Autowired
	private IProductDAORepository productRepository;

	@Override
	public List<Product> findAll() {
		return productRepository.findAll();
	}

	@Override
	public Product findById(int id) {
		Optional<Product> optional = productRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		return null;
	}

	@Override
	public void update(Product product) {
		productRepository.save(product);
	}

	@Override
	public void delete(int id) {

		productRepository.deleteById(id);
//		productRepository.delete(id);

	}

	@Override
	public Product add(Product product) {
	Product product2 =	productRepository.save(product);
	return product2;
		
	}

//	@Override
//	public Optional<Product> add(Product product) {
//		Optional<Product> p = Optional.of(productRepository.save(product));
//		
//		return p;

	}


