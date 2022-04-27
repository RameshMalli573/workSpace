package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	
	@Autowired 
	OrderRepository repository;

	public void saveOrder(Order order) {
		repository.save(order);
	}

}
