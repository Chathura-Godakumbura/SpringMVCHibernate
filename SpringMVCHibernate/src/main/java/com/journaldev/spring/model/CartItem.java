package com.journaldev.spring.model;


import javax.persistence.Entity;

import javax.persistence.Id;


@Entity
public class CartItem {
	@Id
	private Integer id;

	private int quantity;
	
	public CartItem() {
		
	}
	// This is a comment of cartitem 
	

	public CartItem(Integer id, int quantity) {
		super();
		this.id = id;

		this.quantity = quantity;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
}
