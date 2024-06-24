package com.webclient.Dto;

import jakarta.persistence.Column;


public class ProductsDto {
	
	@Column(name="Product_id")
	private long productId;
	@Column(name="Product_name")
	private String productName;
	@Column(name="Description")
	private String productDescription;
	@Column(name="Product_price")
	private long productPrice;
	@Column(name="Image_url")
	private String imageUrl;
	@Column(name="available_quantity")
	private long availableQuantity;
	
	
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public long getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(long productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public long getAvailableQuantity() {
		return availableQuantity;
	}
	public void setAvailableQuantity(long availableQuantity) {
		this.availableQuantity = availableQuantity;
	}
	

}
