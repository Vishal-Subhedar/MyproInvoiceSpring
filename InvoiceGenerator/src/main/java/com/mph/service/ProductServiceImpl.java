package com.mph.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.ProductDao;
import com.mph.entity.Product;
@Service
@Transactional
public class ProductServiceImpl implements ProductService{

	
	@Autowired
	public ProductDao productDao;
	@Override
	public void createProduct(Product product) {
		productDao.createProduct(product);
		
	}

	@Override
	public List<Product> getAllProduct() {
		
		return productDao.getAllProduct() ;
	}

	

	@Override
	public List<Product> updateProduct(Product product) {
		
		return productDao.updateProduct(product);
	}

	@Override
	public List<Product> deleteProduct(int pid) {
		
		return productDao.deleteProduct(pid);
	}

	@Override
	public Product getProduct(int id) {
		
		return productDao.getProduct(id);
	}

}
