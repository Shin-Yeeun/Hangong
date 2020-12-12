package com.hangong.user;

import java.util.Date;

public class UserVO {
	private int sid;
	private String userid;
	private String password;
	private String username;
	private String address;
	private Date regdate;
	
	public int getSeq() {
		return sid;
	}
	public void setSeq(int seq) {
		this.sid = seq;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}

	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	
}
