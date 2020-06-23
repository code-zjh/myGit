package com.dami.user.bean;

import java.util.Date;

public class user {
	private int uid;
	private String name;
	private int sex;
	private String phone;
	private String area;
	private int manager;
	private String username;
	private String password;
	private String photo;
	private Date create_time;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getManager() {
		return manager;
	}
	public void setManager(int manager) {
		this.manager = manager;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public user(String name, int sex, String phone, String area, String username, String password, String photo,
			Date create_time) {
		super();
		this.name = name;
		this.sex = sex;
		this.phone = phone;
		this.area = area;
		this.username = username;
		this.password = password;
		this.photo = photo;
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "user [uid=" + uid + ", name=" + name + ", sex=" + sex + ", phone=" + phone + ", area=" + area
				+ ", manager=" + manager + ", username=" + username + ", password=" + password + ", photo=" + photo
				+ ", create_time=" + create_time + "]";
	}
	
}
