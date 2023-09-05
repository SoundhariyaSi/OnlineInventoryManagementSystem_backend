package com.example.demo.model;



//import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.JoinColumn;
//import jakarta.persistence.OneToMany;


@Entity
public class OrderItem {

	@Id
	private int ord_item_id;
	private int ord_id;
	private int quantity;
	private int unitPrice;
	
	/*@OneToMany(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_order_item_id")
    private List<Order> or;*/

	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItem(int ord_item_id, int ord_id, int quantity,int unitPrice) {
		super();
		this.ord_item_id = ord_item_id;
		this.ord_id = ord_id;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	public int getOrd_item_id() {
		return ord_item_id;
	}

	public void setOrd_item_id(int ord_item_id) {
		this.ord_item_id = ord_item_id;
	}

	public int getOrd_id() {
		return ord_id;
	}

	public void setOrd_id(int ord_id) {
		this.ord_id = ord_id;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

//	/
	
	
	
}
