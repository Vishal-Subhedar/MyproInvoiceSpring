package com.mph.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("SUPPLIER")
public class Supplier extends User {
	
//	public int sid;
//
//	public Supplier() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Supplier(int sid) {
//		super();
//		this.sid = sid;
//	}
//
//	public int getSid() {
//		return sid;
//	}
//
//	public void setSid(int sid) {
//		this.sid = sid;
//	}
//
//	@Override
//	public String toString() {
//		return "Supplier [sid=" + sid + "]";
//	}

}
