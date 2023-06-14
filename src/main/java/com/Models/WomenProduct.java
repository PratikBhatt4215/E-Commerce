package com.Models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class WomenProduct {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int womenid;
	

	public int getWomenid() {
		return womenid;
	}
	public void setWomenid(int womenid) {
		this.womenid = womenid;
	}
	private String wname;
	private String wdec;
	private int wprice;
	private String wurl;
	public String getWname() {
		return wname;
	}
	public void setWname(String wname) {
		this.wname = wname;
	}
	public String getWdec() {
		return wdec;
	}
	public void setWdec(String wdec) {
		this.wdec = wdec;
	}
	public int getWprice() {
		return wprice;
	}
	public void setWprice(int wprice) {
		this.wprice = wprice;
	}
	public String getWurl() {
		return wurl;
	}
	public void setWurl(String wurl) {
		this.wurl = wurl;
	}
	@Override
	public String toString() {
		return "WomenProduct [wname=" + wname + ", wdec=" + wdec + ", wprice=" + wprice + ", wurl=" + wurl + "]";
	}

	
}
