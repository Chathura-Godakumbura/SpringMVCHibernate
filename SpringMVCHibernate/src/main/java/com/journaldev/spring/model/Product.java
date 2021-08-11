package com.journaldev.spring.model;


import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.ManyToMany;


@Entity
public class Product {
	
	@Id
	private Integer product_id;
	
	private String name;
	
	private String description;
	
	private Double price;
		

	public Product() {
		
	}

	

	public Product(Integer product_id, String name, String description, Double price, Product product) {
		super();
		this.product_id = product_id;
		this.name = name;
		this.description = description;
		this.price = price;

	}



	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}


	

}
