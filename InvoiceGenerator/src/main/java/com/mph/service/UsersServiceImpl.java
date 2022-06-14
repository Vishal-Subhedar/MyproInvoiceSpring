package com.mph.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mph.dao.UsersDao;
import com.mph.entity.Customer;
import com.mph.entity.Supplier;
import com.mph.entity.User;
@Service
@Transactional
public class UsersServiceImpl implements UsersService{
	@Autowired
	public UsersDao usersDao;

	@Override
	public void createUser(User user) {
	usersDao.createUser(user);	
	
		
	}

	@Override
	public void createCustomer(Customer customer) {
		usersDao.createCustomer(customer);
		
	}

	@Override
	public void createSupplier(Supplier supplier) {
		usersDao.createSupplier(supplier);
		
	}

}
