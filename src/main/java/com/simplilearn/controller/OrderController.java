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
import com.simplilearn.service.OrderService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class OrderController {

	@Autowired
	private OrderService oredrservice;
	
	@PostMapping("/orderid")
	public Long saveorderid(@RequestBody Order order)
	{
		Order o=oredrservice.saveorder(order);
		return o.getId();
	}
	
	@GetMapping("/orderid/{id}")
	public Order getsingleoredrid(@PathVariable Long id)
	{
		return oredrservice.getsingleorder(id);
	}
	
	@GetMapping("/orderid")
	public List<Order> getallorderid()
	{
		return oredrservice.getalloredrs(); 
	}
}
