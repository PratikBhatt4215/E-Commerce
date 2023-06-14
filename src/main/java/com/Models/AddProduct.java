package com.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class AddProduct {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	private String pname;
	private String pdec;
	private int pprice;
	private String purl;
	private String pgender;

	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdec() {
		return pdec;
	}
	public void setPdec(String pdec) {
		this.pdec = pdec;
	}
	public int getPprice() {
		return pprice;
	}
	public void setPprice(int pprice) {
		this.pprice = pprice;
	}
	public String getPurl() {
		return purl;
	}
	public void setPurl(String purl) {
		this.purl = purl;
	}
	public String getPgender() {
		return pgender;
	}
	public void setPgender(String pgender) {
		this.pgender = pgender;
	}





	
	
	
	
}
