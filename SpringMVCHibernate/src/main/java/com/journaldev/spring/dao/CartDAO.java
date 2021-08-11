package com.journaldev.spring.dao;

import java.util.List;

import com.journaldev.spring.model.CartItem;

public interface CartDAO {
	
	public List<CartItem> listCartItem();

}
