package com.ecommerce.service.inventory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.service.inventory.model.Products;
import com.ecommerce.service.inventory.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	private ProductService productService;

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	
	@GetMapping("/")
	public String root() {
		return "Hi From Product Contoller";
	}
	
	@PostMapping
	public ResponseEntity<Products> saveProduct(@RequestBody Products product){
		return new ResponseEntity<Products>(productService.saveProduct(product), HttpStatus.CREATED);
		
	}
}
