package com.sumit.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "jpa_category")
public class Category {


	@Id
	private String cId;
	private String title;
	

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Product> products=new ArrayList<>();
	
	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	
	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category() {
	}
	
	public Category(String cId, String title) {
		this.cId = cId;
		this.title = title;
	}
	
}
