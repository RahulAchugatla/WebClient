package com.webclient.ServiceImpl;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.webclient.Entities.Products;
import com.webclient.Repository.ProductRepo;
import com.webclient.Service.ProductService;

import reactor.core.publisher.Mono;

@Service
public class ProductServiceImpl implements ProductService {

	final static Logger logger = LoggerFactory.getLogger(ProductServiceImpl.class);

	@Autowired
	private ProductRepo productRepo;

	@Autowired
	private WebClient.Builder webClientBuilder;
	
	@Autowired
	private WebClient webClient;
	/**
	 * Getting product by name
	 */
	@Override
	public Mono<List<Products>> getProductByName(String productName, String sort, String minValue) {
	    return webClient
	            .get()
	            .uri("/getProductByName/{productName}/{sort}/{minValue}",productName, sort, minValue)
	            .retrieve()
	            .bodyToFlux(Products.class)
	            .collectList();
	}

	@Override
	public List<Products> getAllProducts() {
		Mono<List<Products>> products = webClientBuilder.build()
	            .get()
	            .uri("http://localhost:8080/getAllProducts")
	            .retrieve()
	            .bodyToFlux(Products.class)
	            .collectList();

	    return products.block();
	}

}
