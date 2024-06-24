package com.webclient.ServiceImpl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.webclient.Dto.CategoryDto;
import com.webclient.Entities.Category;
import com.webclient.Entities.Products;
import com.webclient.Repository.CategoryRepo;
import com.webclient.Service.CategoryService;

import reactor.core.publisher.Mono;

@Service
public class CategoryImpl implements CategoryService {
	
	final static Logger logger=LoggerFactory.getLogger(CategoryImpl.class);
	
	@Autowired
	private CategoryRepo categoryrepo;
	
	@Autowired
	private WebClient.Builder webClientBuilder;
	
//	@Override
//	public CategoryDto saveCategory(CategoryDto categoryDto) {
//	    WebClient webClient = WebClient.builder().baseUrl("http://localhost:8080").build();
//	    
//	    CategoryDto savedCategoryDto = webClientBuilder.build()
//	    		.post()
//	            .uri("http://localhost:8080/saveCategory")
//	            .bodyValue(categoryDto)//This is requestBody
//	            .retrieve()
//	            .bodyToMono(CategoryDto.class)
//	            .block();
//	            
//	    return savedCategoryDto;
//	}
	
	@Override
	public List<Category> getAllCategory() {
		Mono<List<Category>> category=webClientBuilder.build()
				.get()
				.uri("http://localhost:8080/getAllCategory")
				.retrieve()
				.bodyToFlux(Category.class)
				.collectList();
		return category.block();
	}

	@Override
	public List<Products> getCategoryByName(String categoryName,String sort,String minValue) {
		Mono<List<Products>> category=webClientBuilder.build()
				.get()
				.uri("http://localhost:8080/getCategoryByName/{categoryName}/{sort}/{minValue}",categoryName,sort,minValue)
				.retrieve()
				.bodyToFlux(Products.class)
				.collectList();
		return category.block();
		}
	
	

}
