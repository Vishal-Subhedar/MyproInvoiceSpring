package com.mph.service;

import com.mph.entity.Customer;
import com.mph.entity.Supplier;
import com.mph.entity.User;

public interface UsersService {
	public void createUser(User user);
	public void createCustomer(Customer customer);
	public void createSupplier(Supplier supplier);
}
