package com.ektha.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ektha.app.entity.Product;

public interface IProductDAORepository extends JpaRepository<Product, Integer> {

}
