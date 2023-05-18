package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.Order;

public interface OrderRepository extends JpaRepository<Order,Long>{

}
