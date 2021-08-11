package com.journaldev.spring.model;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Customers {
	@Id
	private Integer Customer_id;
	
	private String email;
	
	private String fname;
	
	private String lname;
	
	private int phone;
	

	public Customers() {
		
	}

	public Customers(Integer customer_id, String email, String fname, String lname, int phone, Customers customer) {
		super();
		Customer_id = customer_id;
		this.email = email;
		this.fname = fname;
		this.lname = lname;
		this.phone = phone;

	}

	public Integer getCustomer_id() {
		return Customer_id;
	}

	public void setCustomer_id(Integer customer_id) {
		Customer_id = customer_id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}


	
	

}
