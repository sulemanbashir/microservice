package com.ecommerce.service.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.inventory.model.Purchases;

public interface PurchaseRepository extends JpaRepository<Purchases, Long> {

}
