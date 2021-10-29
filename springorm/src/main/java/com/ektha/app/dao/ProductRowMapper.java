package com.ektha.app.dao;

import java.sql.ResultSet;

import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.ektha.app.entity.Product;

@Component("productRowMapper")
public class ProductRowMapper implements RowMapper<Product> {

	public Product mapRow(ResultSet resultSet, int rowNum) throws SQLException {

		Product product = new Product();

		product.setId(resultSet.getInt("id"));
		product.setName(resultSet.getString("name"));
		product.setPrice(resultSet.getFloat("price"));
		product.setDescription(resultSet.getString("description"));
		product.setQuantity(resultSet.getInt("quantity"));

		return product;

	}

}
