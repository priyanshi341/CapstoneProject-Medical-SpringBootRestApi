package com.simplilearn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.simplilearn.entity.Product;

import com.simplilearn.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productrepository;
	
	public Product saveproduct(Product product)
	{
		return productrepository.save(product);
	}
	
	public Product getproduct(int id)
	{
		return productrepository.findById(id).get();
	}
	
	public List<Product> getallproducts()

	{
		return productrepository.findAll();
	}
	
	public void updateproduct(int id,Product ref)
	{
		Product product=productrepository.findById(id).get();
		product.setName(ref.getName());
		product.setDescription(ref.getDescription());
		product.setImage(ref.getImage());
		product.setPrice(ref.getPrice());
		product.setQuantity(ref.getQuantity());
	    product.setCategory(ref.getCategory());
	    productrepository.save(product);
	}
	
	public void deleteproduct(int id) {
		productrepository.deleteById(id);
	}
}
