package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Order;
import com.simplilearn.entity.OrderItem;
import com.simplilearn.repository.OrderItemRepository;
import com.simplilearn.repository.OrderRepository;

@Service
public class OrderItemService {
	@Autowired
	private OrderItemRepository orderitemrepository;
	
	public OrderItem saveorderitem(OrderItem order)
	{
		return orderitemrepository.save(order);
	}
	
	public OrderItem getsingleorderitem(long id)
	{
		return orderitemrepository.findById(id).get();
	}
	
	public List<OrderItem> getalloredritems()
	{
		return orderitemrepository.findAll();
	}
	
	
	
}
