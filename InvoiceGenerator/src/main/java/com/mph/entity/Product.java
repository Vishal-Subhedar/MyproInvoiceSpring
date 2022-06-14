package com.mph.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int pid;
	private String  products ;
	private int   price;
	 private int   quantity;
	 private int   total;
	 
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int pid, String products, int price, int quantity, int total) {
		super();
		this.pid = pid;
		this.products = products;
		this.price = price;
		this.quantity = quantity;
		this.total = total;
		
		
	}
	public int getPid() {
		return pid;
	}
	
	
	public String getProducts() {
		return products;
	}
	public int getPrice() {
		return price;
	}
	public int getQuantity() {
		return quantity;
	}
	public int getTotal() {
		return total=this.price*this.quantity;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public void setProducts(String products) {
		this.products = products;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", products=" + products + ", price=" + price + ", quantity=" + quantity
				+ ", total=" + total + "]";
	}
	
	
	 
	 
}
