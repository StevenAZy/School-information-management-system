package com.lcy.entity;

public class staff {
	private String id;
	private String pwd;
	private String name;
	private String depart;
	private String position;
	private String title;
	private String email;
	private String reward;
	private String family;
	
	
	public staff() {
		super();
		// TODO Auto-generated constructor stub
	}


	public staff(String id, String pwd, String name, String depart, String position, String title, String email,
			String reward, String family) {
		super();
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.depart = depart;
		this.position = position;
		this.title = title;
		this.email = email;
		this.reward = reward;
		this.family = family;
	}
	
	public staff(String id, String name, String depart, String position, String title, String email,
			String reward, String family) {
		super();
		this.id = id;
		this.name = name;
		this.depart = depart;
		this.position = position;
		this.title = title;
		this.email = email;
		this.reward = reward;
		this.family = family;
	}
	
	
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepart() {
		return depart;
	}
	public void setDepart(String depart) {
		this.depart = depart;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getReward() {
		return reward;
	}
	public void setReward(String reward) {
		this.reward = reward;
	}
	public String getFamily() {
		return family;
	}
	public void setFamily(String family) {
		this.family = family;
	}
	
	
	


}
