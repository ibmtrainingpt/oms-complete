package com.ibm.searchorder;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.searchorder.repo.OrderRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;	//DI

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	public Optional<Order> getOrder(String orderId) {
		return orderRepository.findById(orderId);
	}
}
