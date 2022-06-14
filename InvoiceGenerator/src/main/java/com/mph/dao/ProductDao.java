package com.mph.dao;

import java.util.List;

import com.mph.entity.Customer;
import com.mph.entity.Product;
import com.mph.entity.Supplier;
import com.mph.entity.User;





public interface ProductDao {
	public void createProduct(Product product);
	public List<Product> getAllProduct();
	public List<Product> updateProduct(Product product);
	public List<Product> deleteProduct(int pid);
	public  Product getProduct(int id);
	
	
}
