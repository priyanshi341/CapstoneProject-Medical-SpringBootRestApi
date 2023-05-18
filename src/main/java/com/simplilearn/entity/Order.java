package com.simplilearn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="OrderId")
public class Order {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public Order() {
	
}

}
