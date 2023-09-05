package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
//
import jakarta.persistence.Table;

@Entity
@Table(name="ProductTable")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int product_id;
	private String sku;
	private String product_name;
	private String size;
	private String color;
	private String gender;
	private int supplier_id;
	private int purch_price;
	private int retail_price;
	private int quantity;
	
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name="fk_categoryid")
//	private Category cg;
	

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int product_id, String sku, String product_name, String size, String color, String gender,
			int supplier_id, int purch_price, int retail_price, int quantity) {
		super();
		this.product_id = product_id;
		this.sku = sku;
		this.product_name = product_name;
		this.size = size;
		this.color = color;
		this.gender = gender;
		this.supplier_id = supplier_id;
		this.purch_price = purch_price;
		this.retail_price = retail_price;
		this.quantity = quantity;
//		this.cg = cg;
	}

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getSupplier_id() {
		return supplier_id;
	}

	public void setSupplier_id(int supplier_id) {
		this.supplier_id = supplier_id;
	}

	public int getPurch_price() {
		return purch_price;
	}

	public void setPurch_price(int purch_price) {
		this.purch_price = purch_price;
	}

	public int getRetail_price() {
		return retail_price;
	}

	public void setRetail_price(int retail_price) {
		this.retail_price = retail_price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

//	public Category getCg() {
//		return cg;
//	}
//
//	public void setCg(Category cg) {
//		this.cg = cg;
//	}
	
	
	
}
