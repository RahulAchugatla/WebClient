package com.webclient.Service;

import java.util.List;
import java.util.Optional;

import com.webclient.Dto.CategoryDto;
import com.webclient.Entities.Category;
import com.webclient.Entities.Products;

public interface CategoryService {
//	public CategoryDto saveCategory(CategoryDto CategoryDto);
	public List<Category> getAllCategory();
	public List<Products> getCategoryByName(String categoryName,String sort,String minValue);

}
