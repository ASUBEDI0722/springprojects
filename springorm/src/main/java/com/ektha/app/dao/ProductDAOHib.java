package com.ektha.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.ektha.app.entity.Product;

public class ProductDAOHib implements IProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	
	@Override
	public void addProduct(Product product) {

		Session session = sessionFactory.openSession();
		Transaction transaction = session.getTransaction();
		transaction.begin();
		session.save(product);
		transaction.commit();
		session.close();
		
	}

	@Override
	public Product findById(int id) {
		Session session = sessionFactory.openSession();
		Product product = session.get(Product.class, id);
		session.close();
		return product;
	}

	@Override
	public List<Product> findALl() {
		
		Session session = sessionFactory.openSession();
		Query<Product> query = session.createQuery("select p from Product p");
		List<Product> products = query.list();
		session.close();
		return products;
	}

	@Override
	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
