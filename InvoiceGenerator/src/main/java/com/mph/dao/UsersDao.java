package com.mph.dao;

import com.mph.entity.Customer;
import com.mph.entity.Supplier;
import com.mph.entity.User;

public interface UsersDao {
	public void createUser(User user);
	public void createCustomer(Customer customer);
	public void createSupplier(Supplier supplier);
}
