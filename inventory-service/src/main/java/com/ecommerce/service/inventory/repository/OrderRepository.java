package com.ecommerce.service.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.service.inventory.model.Orders;



public interface OrderRepository extends JpaRepository<Orders, Long> {


}
