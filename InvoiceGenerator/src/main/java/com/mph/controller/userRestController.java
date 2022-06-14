package com.mph.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mph.entity.Customer;
import com.mph.entity.Product;
import com.mph.entity.Supplier;
import com.mph.entity.User;
import com.mph.service.UsersService;

@RestController
@RequestMapping("/users")
@CrossOrigin(allowCredentials = "false", allowedHeaders = "*", origins = "http://localhost:4200", methods = {
		RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE })
public class userRestController {

	
	@Autowired
	public UsersService usersService;
	
	
	@PostMapping("/createcust")
	public User createCustomer(@RequestBody Customer customer) {
		usersService.createCustomer(customer);
	return customer;
	}
	
	@PostMapping("/createsup")
	public User createSupplier(@RequestBody Supplier supplier) {
		usersService.createSupplier(supplier);
	return supplier;
	}
	
	
}
