package com.simplilearn.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ordertables")
public class OrderItem {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private long id;
private long orderid;
private long userid;
private String productname;
private long productprice;
private LocalDate date;
private long productquantity;
private long totalprice;

public LocalDate getDate() {
	return date;
}


public void setDate(LocalDate date) {
	this.date = date;
}




public long getProductprice() {
	return productprice;
}


public void setProductprice(long productprice) {
	this.productprice = productprice;
}


public long getId() {
	return id;
}


public void setId(long id) {
	this.id = id;
}


public long getOrderid() {
	return orderid;
}


public void setOrderid(long orderid) {
	this.orderid = orderid;
}


public long getUserid() {
	return userid;
}


public void setUserid(long userid) {
	this.userid = userid;
}


public String getProductname() {
	return productname;
}


public void setProductname(String productname) {
	this.productname = productname;
}


public long getProductquantity() {
	return productquantity;
}


public void setProductquantity(long productquantity) {
	this.productquantity = productquantity;
}


public long getTotalprice() {
	return totalprice;
}


public void setTotalprice(long totalprice) {
	this.totalprice = totalprice;
}



public OrderItem(long orderid, long userid, String productname, long productprice, LocalDate date, long productquantity,
		long totalprice) {
	super();
	this.orderid = orderid;
	this.userid = userid;
	this.productname = productname;
	this.productprice = productprice;
	this.date = date;
	this.productquantity = productquantity;
	this.totalprice = totalprice;
}

public OrderItem() {
	
}

}
