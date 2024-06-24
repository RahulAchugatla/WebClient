package com.webclient.Controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webclient.Dto.CategoryDto;
import com.webclient.Entities.Category;
import com.webclient.Entities.Products;
import com.webclient.ServiceImpl.CategoryImpl;
import com.webclient.ServiceImpl.ProductServiceImpl;

import ch.qos.logback.classic.Logger;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin
@RequestMapping("/WebClient")
public class CategoryController {

	final static Logger logger = (Logger) LoggerFactory.getLogger(CategoryController.class);

	@Autowired
	private CategoryImpl categoryService;

	@Autowired
	private ProductServiceImpl productServiceImpl;

	/**
	 * 
	 * @param categoryDto
	 * @return
	 */
//	@PostMapping(path = "/saveCategory")
//	public ResponseEntity<?> saveCategory(@RequestBody CategoryDto categoryDto) {
//
//		try {
//			logger.info("CategoryController :: saveCategory() - Begin");
//			CategoryDto categoryDto1 = categoryService.saveCategory(categoryDto);
//			logger.info("CategoryController :: saveCategory() - End");
//			return new ResponseEntity<CategoryDto>(categoryDto1, HttpStatus.OK);
//		} catch (Exception e) {
//			logger.error("CategoryController :: saveCategory()", e);
//			return ResponseEntity.status(400).body("Customer not saved");
//		}
//	}

	/**
	 * getting all products by category
	 * 
	 * @return
	 */
	@GetMapping(path = "/getAllCategory")
	public ResponseEntity<?> getCategory() {

		try {
			logger.info("CategoryController :: getCategory() - Begin");
			List<Category> category = categoryService.getAllCategory();
			logger.info("CategoryController :: getCategory() - End");
			return new ResponseEntity<List<Category>>(category, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("CategoryController :: getCategory()", e);
			return ResponseEntity.status(404).body("Categories not found");
		}

	}

	/**
	 * getting all products
	 * 
	 * @return
	 */
	@GetMapping(path = "/getAllProducts")
	public ResponseEntity<?> getAllProducts() {

		try {
			logger.info("CategoryController :: getAllProducts() - Begin");
			List<Products> products = productServiceImpl.getAllProducts();
			logger.info("CategoryController :: getAllProducts() - End");
			return new ResponseEntity<List<Products>>(products, HttpStatus.OK);
		} catch (Exception e) {
			logger.error("CategoryController :: getAllProducts() -Error", e);
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	/**
	 * getting product by name
	 * 
	 * @param productName -product name
	 * @param sort        - sorting ascending or descending
	 * @param minValue    - getting product above minPrice
	 * @return
	 */
	@GetMapping("/getProductByName/{productName}/{sort}/{minValue}")
	public ResponseEntity<Mono<List<Products>>> getProductByName(@PathVariable String productName, @PathVariable String sort,
	        @PathVariable String minValue) {
	    logger.info("CategoryController :: getProductByName() - Begin");
	    Mono<List<Products>> product = productServiceImpl.getProductByName(productName, sort, minValue);
	    logger.info("CategoryController :: getProductByName() - End");
	    return new ResponseEntity<Mono<List<Products>>>(product,HttpStatus.OK);
	}

	/**
	 * 
	 * @param categoryName - category Name
	 * @param sort         - sorting ascending or descending
	 * @param minValue     - getting product above min price
	 * @return
	 */
	@GetMapping(path = "/getCategoryByName/{categoryName}/{sort}/{minValue}")
	public ResponseEntity<List<Products>> getCategoryByName(@PathVariable String categoryName,
			@PathVariable String sort, @PathVariable String minValue) {

			logger.info("CategoryController :: getCategoryByName() - Begin");
			List<Products> category = categoryService.getCategoryByName(categoryName, sort, minValue);
			logger.info("CategoryController :: getCategoryByName() - End");
			return new ResponseEntity<List<Products>>(category, HttpStatus.OK);	
	}
	
}
