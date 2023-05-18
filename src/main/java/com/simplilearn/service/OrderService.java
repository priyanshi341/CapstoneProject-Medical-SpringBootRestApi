package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Order;
import com.simplilearn.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderrepository;
	
	public Order saveorder(Order order)
	{
		return orderrepository.save(order);
	}
	
	public Order getsingleorder(long id)
	{
		return orderrepository.findById(id).get();
	}
	
	public List<Order> getalloredrs()
	{
		return orderrepository.findAll();
	}
	
	
	
}
