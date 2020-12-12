package com.hangong.product;

import java.util.Date;

public class ProductVO {
	
	private int sid;
//	private String password;
	private String productname;
//	private String address;
	private String price;
	private String description;
	private Date regdate;
	
	public int getSeq() {
		return sid;
	}
	public void setSeq(int seq) {
		this.sid = seq;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
