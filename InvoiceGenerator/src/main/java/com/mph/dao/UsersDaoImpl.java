package com.mph.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mph.entity.Customer;
import com.mph.entity.Supplier;
import com.mph.entity.User;
@Repository
public class UsersDaoImpl implements UsersDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void createUser(User user) {
		
       getSession().saveOrUpdate(user);
        
        System.out.println("product Saved successfully...");
		
	}

	@Override
	public void createCustomer(Customer customer) {
       getSession().saveOrUpdate(customer);
        
        System.out.println("customer Saved successfully...");
		
	}

	@Override
	public void createSupplier(Supplier supplier) {
      getSession().saveOrUpdate(supplier);
        
        System.out.println("supplier Saved successfully...");
		
	}

}
