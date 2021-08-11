package com.journaldev.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.journaldev.spring.dao.CartDAO;
import com.journaldev.spring.model.CartItem;

@Service
public class CartItemServiceImpl implements CartItemService {
	
	private CartDAO cartDAO;

	
	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}
	
	@Override
	@Transactional 
	public List<CartItem> listCartItem(){
		return this.cartDAO.listCartItem();
	}
}
