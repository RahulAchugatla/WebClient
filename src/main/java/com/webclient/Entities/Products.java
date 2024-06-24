package com.webclient.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Product_id")
	private long productId;
	@Column(name = "Product_name")
	private String productName;
	@Column(name="Description")
	private String productDescription;
	@Column(name = "Product_price")
	private long productPrice;
	@Column(name="Image_url")
	private String imageUrl;
	@Column(name="available_quantity")
	private long availableQuantity;

	@ManyToOne
	@JoinColumn(name = "category_id")
	@JsonIgnore
	private Category category;
	
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

	public void setProductPrice(long product_price) {
		this.productPrice = product_price;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
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

