package com.webclient.Dto;

import java.util.List;


import jakarta.persistence.Column;


public class CategoryDto {

	@Column(name="Category_Id")
	private long categoryId;
	@Column(name="Category_name")
	private String categoryName;
	
	private List<ProductsDto> products;
	
	public long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(long categoryId) {
		this.categoryId = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public List<ProductsDto> getProducts() {
		return products;
	}
	public void setProducts(List<ProductsDto> products) {
		this.products = products;
	}

}
