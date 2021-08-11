package com.journaldev.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Advert")
public class Advert {
	
	@Id
	@Column(name="Advertid")
	private int advertid;
	
	private String AdvertType;
	
	private String AdvertSize;
	
	private String AdvertPrice;
	
	public Advert() {
		
	}
	

	public Advert(int advertid, String advertType, String advertSize, String advertPrice) {
		super();
		this.advertid = advertid;
		AdvertType = advertType;
		AdvertSize = advertSize;
		AdvertPrice = advertPrice;
	}



	public int getAdvertid() {
		return advertid;
	}



	public void setAdvertid(int advertid) {
		this.advertid = advertid;
	}



	public String getAdvertType() {
		return AdvertType;
	}



	public void setAdvertType(String advertType) {
		AdvertType = advertType;
	}



	public String getAdvertSize() {
		return AdvertSize;
	}



	public void setAdvertSize(String advertSize) {
		AdvertSize = advertSize;
	}



	public String getAdvertPrice() {
		return AdvertPrice;
	}



	public void setAdvertPrice(String advertPrice) {
		AdvertPrice = advertPrice;
	}
	
	
	
	

}
