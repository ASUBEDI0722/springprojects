package com.ektha.app.dao;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.ektha.app.entity.Product;

@Repository
public class ProductDAO implements IProductDAO {

	private Logger logger = LoggerFactory.getLogger(ProductDAO.class);

	private static String SQL_INSERT = "insert into test.product(id, name, price, description, quantity) values (?,?,?,?,?)";

	private static final String SQL_SELECT_QUERY_ID = "select * from test.product where id=?";

	private static final String SQL_SELECT_QUERY = "select * from test.product";

	private static final String SQL_UPDATE_QUERY = "update test.product set name=?, price=?, description=?, quantity=? where id =? ";

	private static final String SQL_DELETE_QUERY = " delete from test.product where id = ?";

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private ProductRowMapper productRowMapper;

	public ProductDAO() {

	}

	public void addProduct(Product product) {

		logger.info("********add()*******");
		int noOfRows = jdbcTemplate.update(SQL_INSERT, product.getId(), product.getName(), product.getPrice(),
				product.getDescription(), product.getQuantity());

		if (noOfRows == 1) {

			System.out.println("Record added successsfully.");
		}
	}

	public Product findById(int id) {
		logger.info("********findById()*******");

		Product product = jdbcTemplate.queryForObject(SQL_SELECT_QUERY_ID, productRowMapper, id);

		return product;
	}

	public List<Product> findALl() {
		logger.info("********findALl()*******");

		List<Product> productList = jdbcTemplate.query(SQL_SELECT_QUERY, productRowMapper);
		return productList;
	}

	public boolean updateProduct(Product product) {
		logger.info("********updateProduct()*******");

		int updateProduct = jdbcTemplate.update(SQL_UPDATE_QUERY, product.getName(), product.getPrice(),
				product.getDescription(), product.getQuantity(), product.getId());

		if (updateProduct == 1) {

			System.out.println("Product updated successfully.");
			return true;
		}
		return false;
	}

	public boolean delete(int id) {
		logger.info("********delete()*******");

		int deleteProduct = jdbcTemplate.update(SQL_DELETE_QUERY, id);

		if (deleteProduct == 1) {
			System.out.println("Product deleted successfully.");
			return true;
		}

		return false;
	}

}
