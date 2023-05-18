package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
