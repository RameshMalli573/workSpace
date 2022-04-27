package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class UserControl {
	
	@Autowired
	Services service;
	
	
	
	@PostMapping
	void save(@RequestBody Order order) {
		if(order.item.isEmpty() || order.price < 0) {
			if(order.item.isEmpty()) {
				throw new IllegalArgumentException("Item Cannot Be Empty");
			}
			else {
				throw new IllegalArgumentException("Price Cannot be Negative");
			}
		}
		service.saveOrder(order);
	}
	
	@GetMapping
	List<Order> getOrders() {
		return service.getOrders();
	}
	
}