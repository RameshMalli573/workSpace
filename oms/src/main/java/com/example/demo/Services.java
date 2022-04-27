package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class Services {
	List<Order> orders = new ArrayList<Order>();

	public void saveOrder(Order order) {
		System.out.println(order.getItem());
		System.out.println(order.getPrice());
		orders.add(order);
		
	}

	public List<Order> getOrders() {
		return orders;
	}
}
