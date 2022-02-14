package com.ecommerce.service.inventory.service;

import org.springframework.stereotype.Service;

import com.ecommerce.service.inventory.model.Products;
import com.ecommerce.service.inventory.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService{

	
	private ProductRepository productRepository;
	
	
	public ProductServiceImpl(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}


	@Override
	public Products saveProduct(Products product) {
		return productRepository.save(product);
	}

}
