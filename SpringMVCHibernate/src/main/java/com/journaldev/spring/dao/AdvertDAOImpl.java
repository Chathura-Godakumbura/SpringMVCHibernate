package com.journaldev.spring.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.journaldev.spring.model.Advert;

@Repository
public class AdvertDAOImpl implements AdvertDAO{
	
	private static final Logger logger = LoggerFactory.getLogger(BookDAOImpl.class);

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sf){
		this.sessionFactory = sf;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Advert> listAdvert(){
	
		Session session = this.sessionFactory.getCurrentSession();
		List<Advert> advertList = session.createQuery("from Advert").list();
		for (Advert A : advertList) {
			logger.info("Advert List::" +A);
		}
		
		return advertList;
	}
	
	
}
