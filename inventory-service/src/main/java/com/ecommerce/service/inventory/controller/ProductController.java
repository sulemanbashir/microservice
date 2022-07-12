package com.ecommerce.service.inventory.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@GetMapping("/allproducts")
	public List<Products> getAllProducts(){
		return productService.getAllProducts();
	}
	
	// http:localhost:8080/api/product/1
	@GetMapping("{id}") //path variable
	public ResponseEntity<Products> getProductById(@PathVariable("id") long id){
		return new ResponseEntity<Products>(productService.getProductById(id), HttpStatus.OK);
	}
	
	@PutMapping("{id}")
	public ResponseEntity<Products> updateProduct(@PathVariable("id") long id, @RequestBody Products product){
		return new ResponseEntity<Products>(productService.updateProduct(product, id), HttpStatus.OK);
	}
	
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> updateProduct(@PathVariable("id") long id){
		productService.deleteProduct(id);
		return new ResponseEntity<String>("Product deleted Successfully...", HttpStatus.OK);
	}
	
}
