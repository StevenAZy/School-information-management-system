package com.lcy.entity;

public class admin {
	private String  id;
	private String pwd;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	public admin() {
		super();
	}
	
	
	public admin(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}

	
	
}
