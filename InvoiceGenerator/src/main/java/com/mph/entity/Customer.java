package com.mph.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@DiscriminatorValue("CUSTOMER")
public class Customer extends User {
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
//	private int cid;
//
//	public Customer() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Customer(int cid) {
//		super();
//		this.cid = cid;
//	}
//
//	public int getCid() {
//		return cid;
//	}
//
//	public void setCid(int cid) {
//		this.cid = cid;
//	}
//
//	@Override
//	public String toString() {
//		return "Customer [cid=" + cid + "]";
//	}

	

}
