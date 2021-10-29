package com.ektha.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ektha.app.dao.IProductDAO;
import com.ektha.app.dto.ProductDTO;
import com.ektha.app.entity.Product;

@Service
public class ProductServiceImpl implements IProductService {

	@Autowired
	private IProductDAO productDAO;

	@Override
	public ProductDTO findById(int id) {
		Product product = productDAO.findById(id);

		ProductDTO productDTO = new ProductDTO();

		BeanUtils.copyProperties(product, productDTO);
		return productDTO;
	}

	@Override
	public List<ProductDTO> findAll() {
		List<ProductDTO> productDTOsList = new ArrayList<ProductDTO>();
		List<Product> products = productDAO.findAll();
		for (Product product2 : products) {
			ProductDTO productDTO = new ProductDTO();
			BeanUtils.copyProperties(product2, productDTO);
			productDTOsList.add(productDTO);

		}

		return productDTOsList;
	}

	@Override
	public ProductDTO add(ProductDTO productDTO) {

		Product product = new Product();
		BeanUtils.copyProperties(productDTO, product);

		Product product2 = productDAO.add(product);
		ProductDTO productDTO2 = new ProductDTO();
		BeanUtils.copyProperties(product2, productDTO2);
		return productDTO2;
	}

//	@Override
//	public ProductDTO add(ProductDTO productDTO) {
//		Product product = new Product();
//		BeanUtils.copyProperties(productDTO, product);
//		
//		Product product2 = productDAO.add(product);
//		
//		
//		return null;
//	}

//	@Override
//	public boolean add(Product product) {
//		
//		
//		Optional<Product> p = productDAO.add(product);
//		if(p.isPresent()) {
//			return true;
//		}
//		
//		return false;

}
