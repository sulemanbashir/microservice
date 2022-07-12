package com.ecommerce.service.inventory.service;

import java.util.List;

import com.ecommerce.service.inventory.model.Products;

public interface ProductService {
	
	Products saveProduct(Products product);
	List<Products> getAllProducts();
	Products getProductById(long id);
	Products updateProduct(Products product, long id);
	void deleteProduct(long id);
}
