package com.rakuten;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
	@Autowired OrderRepository repository;
	private List<Order> orders = new ArrayList<Order>();
	public void save(Order order) {
		repository.save(order);
		orders.add(order);
	}
	public List<Order> getAccounts() {
		return null;
	}

}
