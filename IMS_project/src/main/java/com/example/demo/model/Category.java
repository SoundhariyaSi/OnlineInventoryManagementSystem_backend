package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="categorydetails")

public class Category {

	@Id
	private int id;
	private String categoryname;
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Category(int id, String categoryname) {
		super();
		this.id = id;
		this.categoryname = categoryname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	
	
	
}
