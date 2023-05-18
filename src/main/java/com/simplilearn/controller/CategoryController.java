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

import com.simplilearn.entity.Category;
import com.simplilearn.service.CategoryService;


@CrossOrigin(origins="http://localhost:4200")
@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryservice;
	
	
	@PostMapping("/category")
	public Category savecategory(@RequestBody Category category)
	{
		return categoryservice.savecategory(category);
	}
	
	
	@GetMapping("/category/{id}")
	public Category getcategory(@PathVariable int id)
	{
		return categoryservice.getcategory(id);
	}
	
	
	@GetMapping("/category")
	public List<Category> getallcategories()
	{
		return categoryservice.getallcategories();
	}
	
	@PutMapping("/category/{id}")
	public void updatecategory(@RequestBody Category category,@PathVariable int id)
	{
		categoryservice.updatecategory(id, category);
	}
	
	
	@DeleteMapping("/category/{id}")
	public void deletecategory(@PathVariable int id )
	{
		categoryservice.deletecategory(id);
	}
}
