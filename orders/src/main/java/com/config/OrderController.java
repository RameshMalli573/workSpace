package com.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/order")
public class OrderController {
	
	public static HashMap<String,Integer> ordersMap = new HashMap<>();
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/newOrder")
	void createOrder(@RequestBody Order order) {
		orderService.save(order);
	}
	
	@GetMapping("/searchByOrderId/{orderId}")
	public List<Order> searchByOrderId(@PathVariable String orderId){
		List<Order> filteredOrders = new ArrayList<>();
		int key = ordersMap.get(orderId);
		filteredOrders.add(orderService.getOrderByOrderId(key));
		return filteredOrders;
	}
	
	@GetMapping("/searchByStoreId/{storeId}")
	public List<Order> searchByStoreId(@PathVariable String StoreId){
		List<Order> filteredOrders = new ArrayList<>();
		int key = ordersMap.get(StoreId);
		filteredOrders.add(orderService.getOrderByOrderId(key));
		return filteredOrders;
	}
	
}
