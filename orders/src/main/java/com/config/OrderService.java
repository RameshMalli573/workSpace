package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;
	
	void save(Order order) {
		OrderController.ordersMap.put(order.getStoreId(), order.getId());
		OrderController.ordersMap.put(order.getOrderNo(), order.getId());
		
		orderRepository.save(order);
	}

	public Order getOrderByOrderId(int orderId) {
		return orderRepository.getById(orderId);
	}
	
}
