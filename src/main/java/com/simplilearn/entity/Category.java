package com.simplilearn.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="category")
public class Category {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
private String name;
private String description;
@OneToMany(mappedBy="category")
private List<Product> list=new ArrayList<Product>();
public int getId() {
	return id;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	
}
public Category(String name,String description) {
	super();
	this.name = name;
	this.description=description;
}
public Category() {
	
}


}
