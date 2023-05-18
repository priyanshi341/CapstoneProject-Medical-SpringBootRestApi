package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simplilearn.entity.Category;
import com.simplilearn.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository categoryrepository;
	
	public Category savecategory(Category category)
	{
		return categoryrepository.save(category);
	}
	
	public Category getcategory(int id)
	{
		return categoryrepository.findById(id).get();
	}
	
	public List<Category> getallcategories()

	{
		return categoryrepository.findAll();
	}
	
	public void updatecategory(int id,Category ref)
	{
		Category category=categoryrepository.findById(id).get();
		category.setName(ref.getName());
	    category.setDescription(ref.getDescription());
	}
	
	public void deletecategory(int id) {
		categoryrepository.deleteById(id);
	}
}
