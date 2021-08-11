package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.CartItem;

@Repository
public class CartDAOImpl implements CartDAO {

	private static final Logger logger = LoggerFactory.getLogger(CartDAOImpl.class);
	
	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CartItem> listCartItem(){
		Session session = this.sessionFactory.getCurrentSession();
		List<CartItem> CartIteamList = session.createQuery("from CartItem").list();
		for(CartItem C : CartIteamList) {
			logger.info("CartItem List::"+C);
		}
		return CartIteamList;
	}
			
}
