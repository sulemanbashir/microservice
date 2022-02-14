package com.ecommerce.service.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.inventory.model.Products;

public interface ProductRepository extends JpaRepository<Products, Long> {

}
