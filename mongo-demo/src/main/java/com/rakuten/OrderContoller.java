package com.rakuten;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderContoller {
	@Autowired OrderService service;
	
	@PostMapping
	void saveAccount(@RequestBody Order order) {
		System.out.println(order.getItem());
		System.out.println(order.getPrice());
		System.out.println(order.getContactNumber());
		
		service.save(order);
	}
	
	@GetMapping
	List<Order> getAccounts(){
		return service.getAccounts();
	}
}
