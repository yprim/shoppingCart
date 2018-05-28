package com.shoppingCart.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingCart.dto.Category;
import com.shoppingCart.dto.Product;
import com.shoppingCart.repository.CategoryRepository;
import com.shoppingCart.repository.ProductRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@GetMapping("/")
	public ResponseEntity<List<Product>> listAllProducts(){
		List<Product> products = productRepository.findAll();
		return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
	}
}