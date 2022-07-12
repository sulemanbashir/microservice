package com.ecommerce.service.inventory.service;

import java.util.List;

import com.ecommerce.service.inventory.model.Orders;

public interface OrderService {
	Orders saveOrder(Orders order);
	List<Orders> getAllOrders();
	Orders getOrderById(long id);
	Orders updateOrder(Orders order, long id);
	void deleteOrder(long id);
}
