package com.simplilearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simplilearn.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long>{

}
