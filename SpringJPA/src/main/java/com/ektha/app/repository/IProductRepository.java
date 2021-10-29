
  package com.ektha.app.repository;
  
  import org.springframework.data.jpa.repository.JpaRepository;
  
  import com.ektha.app.entity.Product;
  
  public interface IProductRepository extends JpaRepository<Product, Integer> {
  
  }
 
