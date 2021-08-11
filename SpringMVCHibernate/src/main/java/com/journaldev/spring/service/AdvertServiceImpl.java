package com.journaldev.spring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.journaldev.spring.dao.AdvertDAO;
import com.journaldev.spring.model.Advert;



@Service
public class AdvertServiceImpl implements AdvertService{
	
	private AdvertDAO advertDAO;
	

	public void setAdvertDAO(AdvertDAO advertDAO) {
		this.advertDAO = advertDAO;
	}


	@Override
	@Transactional
	public List<Advert> listAdvert() {
	return this.advertDAO.listAdvert();
	}

}