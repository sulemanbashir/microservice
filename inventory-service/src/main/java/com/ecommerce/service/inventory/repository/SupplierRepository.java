package com.ecommerce.service.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.inventory.model.Suppliers;

public interface SupplierRepository extends JpaRepository<Suppliers, Long> {

}
