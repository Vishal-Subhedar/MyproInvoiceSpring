package com.mph.dao;


import java.util.Collections;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.mph.entity.Product;
import com.mph.entity.ProductComparator;





@Repository
public class ProductDaoImpl implements ProductDao  {
	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void createProduct(Product product) {

		product.setTotal(product.getQuantity() * product.getPrice());		
		getSession().saveOrUpdate(product);
		System.out.println("Product Saved successfully...");

	}

	@Override
	public List<Product> getAllProduct() {
		Query qry = getSession().createQuery("select p from Product p");
		List<Product> prolist = qry.list();
		Collections.sort(prolist,new ProductComparator());
		System.out.println("Product  list from dao : " + prolist);
		return prolist;
	}

	

	@Override
	public List<Product> updateProduct(Product product) {
		Query qry = getSession().createQuery(" update Product  p set products=:products,price=:price,quantity=:quantity,total=:total where pid=:pid");
		qry.setParameter("products", product.getProducts());
		qry.setParameter("price", product.getPrice());
		qry.setParameter("quantity", product.getQuantity());
		qry.setParameter("total",product.getTotal());
		qry.setParameter("pid", product.getPid());
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Updated " + noofrows + " rows. ");
		}
		return getAllProduct();
	}

	@Override
	public List<Product> deleteProduct(int pid) {
		Query qry = getSession().createQuery(" delete Product  p where pid=:pid");
		qry.setParameter("pid", pid);
		int noofrows = qry.executeUpdate();
		if (noofrows > 0) {
			System.out.println("Deleted " + noofrows + " rows. ");
		}
		return getAllProduct();

	}

	@Override
	public Product getProduct(int id) {
		Query qry = getSession().createQuery("From Product p where pid=:id");
		qry.setParameter("id", id);
		Product pro = (Product) qry.uniqueResult();
		System.out.println("search result : " + pro);
		return pro;
	}

	
	

	
	
}
