package com.webclient.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.webclient.Entities.Products;

@Repository
public interface ProductRepo extends JpaRepository<Products,Long>{
	 List<Products> findByproductNameContainingIgnoreCase(String productName);
	 
}
