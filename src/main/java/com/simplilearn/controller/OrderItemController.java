package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.entity.Order;
import com.simplilearn.entity.OrderItem;
import com.simplilearn.service.OrderItemService;
import com.simplilearn.service.OrderService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderItemController {
	@Autowired
	private OrderItemService orderitemservice;
	
	@PostMapping("/orderitems")
	public Long saveorderitem(@RequestBody OrderItem order)
	{
		OrderItem o=orderitemservice.saveorderitem(order);
		return o.getId();
	}
	
	@GetMapping("/orderitems/{id}")
	public OrderItem getsingleoredritem(@PathVariable Long id)
	{
		return orderitemservice.getsingleorderitem(id);
	}
	
	@GetMapping("/orderitems")
	public List<OrderItem> getallorderitems()
	{
		return orderitemservice.getalloredritems(); 
	}
}
