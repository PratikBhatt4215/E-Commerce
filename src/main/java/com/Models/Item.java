package com.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private int productid;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", productid=" + productid + "]";
	}

	public Item(int id, int productid) {
		super();
		this.id = id;
		this.productid = productid;
	}

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	
	
}
