package com.webclient.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.webclient.Entities.Products;

import reactor.core.publisher.Mono;


@Component
public interface ProductService {
	
	public Mono<List<Products>> getProductByName(String productName,String sort,String minValue);
	public List<Products> getAllProducts();
}
