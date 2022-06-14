package com.mph.service;

import java.util.List;

import com.mph.entity.Product;

public interface ProductService {
	public void createProduct(Product product);
	public List<Product> getAllProduct();
	public List<Product> updateProduct(Product product);
	public List<Product> deleteProduct(int pid);
	public  Product getProduct(int id);

}
