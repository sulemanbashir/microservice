package com.ecommerce.service.inventory.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.ecommerce.service.inventory.exception.ResourceNotFoundException;
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


	@Override
	public List<Products> getAllProducts() {
		return productRepository.findAll();
	}


	@Override
	public Products getProductById(long id) {
		Optional<Products> product =  productRepository.findById(id);
		
		if(product.isPresent()) {
			return product.get();
		}
		
		throw new ResourceNotFoundException("Product", "Id", id);
	}


	@Override
	public Products updateProduct(Products product, long id) {
		Products existingProduct = null;
		Optional<Products> productInDb = productRepository.findById(id);

		if (productInDb.isPresent()) {
			existingProduct = productInDb.get();
		} else {
			throw new ResourceNotFoundException("Product", "Id", id);
		}

		existingProduct.setProductName(product.getProductName());
		existingProduct.setQuantity(product.getQuantity());
		existingProduct.setProductPrice(product.getProductPrice());
		productRepository.save(existingProduct);
		return existingProduct;
	}


	@Override
	public void deleteProduct(long id) {
		Optional<Products> productInDb = productRepository.findById(id);

		if (productInDb.isPresent()) {
			productRepository.deleteById(id);
		} else {
			throw new ResourceNotFoundException("Product", "Id", id);
		}
		
		
	}

}
