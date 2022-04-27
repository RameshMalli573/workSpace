package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	@Autowired
	OrderService orderService;
	
	void fastDelivery() {
		System.out.println("fast Delivery called");
	}
	void normalDelivery() {
		System.out.println("normal Delivery called");
	}
	@PostMapping("/newOrder")
	void createOrder(@RequestBody Order order) {
		orderService.saveOrder(order);
		
	}
	
	@GetMapping("/order")
	void getorders() {
		System.out.println("get method called");
	}
}
