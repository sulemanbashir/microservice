package com.ecommerce.service.inventory.service;

import java.util.List;
import java.util.Optional;

import com.ecommerce.service.inventory.exception.ResourceNotFoundException;
import com.ecommerce.service.inventory.model.Orders;
import com.ecommerce.service.inventory.repository.OrderRepository;

public class OrderServiceImpl implements OrderService {

	private OrderRepository orderRepository;

	public OrderServiceImpl(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	@Override
	public Orders saveOrder(Orders order) {
		return orderRepository.save(order);
	}

	@Override
	public List<Orders> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Orders getOrderById(long id) {
		Optional<Orders> order = orderRepository.findById(id);

		if (order.isPresent()) {
			return order.get();
		}

		throw new ResourceNotFoundException("Order", "Id", id);
	}

	@Override
	public Orders updateOrder(Orders order, long id) {
		Orders existingOrder = null;
		Optional<Orders> orderDb = orderRepository.findById(id);

		if (orderDb.isPresent()) {
			existingOrder = orderDb.get();
		} else {
			throw new ResourceNotFoundException("Order", "Id", id);
		}

//		existingOrder.(product.getProductName());
//		existingProduct.setQuantity(product.getQuantity());
//		existingProduct.setProductPrice(product.getProductPrice());
//		productRepository.save(existingProduct);
		return existingOrder;
	}

	@Override
	public void deleteOrder(long id) {
		Optional<Orders> orderDb = orderRepository.findById(id);

		if (orderDb.isPresent()) {
			orderRepository.deleteById(id);
		} else {
			throw new ResourceNotFoundException("Order", "Id", id);
		}

	}

}
