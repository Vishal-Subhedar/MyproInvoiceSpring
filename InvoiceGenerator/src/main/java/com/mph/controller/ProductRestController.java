package com.mph.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.mph.entity.Product;

import com.mph.service.ProductService;


@RestController
@RequestMapping("/product")
@CrossOrigin(allowCredentials = "false", allowedHeaders = "*", origins = "http://localhost:4200", methods = {
		RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class ProductRestController {
	@Autowired
	public ProductService productService;
	
	@GetMapping("/allpro")
	public ResponseEntity<List<Product>> listAllProduct() {
		List<Product> li = productService.getAllProduct();
		if (li.isEmpty()) {
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Product>>(li, HttpStatus.OK);
	}

	@PostMapping("/createpro")
	public Product createProduct(@RequestBody Product product) {
		productService.createProduct(product);
		return product;
	}
	
	@PutMapping("/updatepro")
	public ResponseEntity<List<Product>> updateProduct(@RequestBody Product product) {
		List<Product> li = productService.updateProduct(product);
		
		if (li.isEmpty()) {
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Product>>(li,HttpStatus.OK);
	}
	
	@DeleteMapping("/deletepro/{id}")
	public ResponseEntity<List<Product>> deleteProduct(@PathVariable("id") int pid) {
		List<Product> li = productService.deleteProduct(pid);
		if (li.isEmpty()) {
			return new ResponseEntity<List<Product>>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<List<Product>>(li,HttpStatus.OK);
	}

	@GetMapping("/getpro/{pid}")
	public ResponseEntity<Product> getProduct(@PathVariable("pid") int id) {
		Product product = productService.getProduct(id);
		if (product == null) {
			return new ResponseEntity<Product>(HttpStatus.NO_CONTENT);
		}

		return new ResponseEntity<Product>(product, HttpStatus.OK);
	}
	
	
}
