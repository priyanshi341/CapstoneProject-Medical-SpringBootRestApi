package com.simplilearn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.simplilearn.entity.Product;

import com.simplilearn.service.ProductService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class ProductController {
	
	@Autowired
	private ProductService productservice;
	
	
	@PostMapping("/product")
	public Product saveproduct(@RequestBody Product product)
	{
		return productservice.saveproduct(product);
	}
	
	
	@GetMapping("/product/{id}")
	public Product getproduct(@PathVariable int id)
	{
		return productservice.getproduct(id);
	}
	
	
	@GetMapping("/product")
	public List<Product> getallproducts()
	{
		return productservice.getallproducts();
	}
	
	@PutMapping("/product/{id}")
	public void updatecategory(@RequestBody Product product,@PathVariable int id)
	{
		productservice.updateproduct(id, product);
	}
	
	
	@DeleteMapping("/product/{id}")
	public void deletecategory(@PathVariable int id )
	{
		productservice.deleteproduct(id);
	}


}
