package com.webclient.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.webclient.Entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long>  {

    List<Category> findByCategoryNameContainingIgnoreCase(String categoryName);
    
}
