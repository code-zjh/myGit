package com.dami.category.bean;

import java.util.Date;

public class category {
	private int cid;
	private String name;
	private int state;
	private int order_number;
	public category(int cid, String name, int state, int order_number, String description, Date create_time) {
		super();
		this.cid = cid;
		this.name = name;
		this.state = state;
		this.order_number = order_number;
		this.description = description;
		this.create_time = create_time;
	}
	private String description;
	public category(String name, int state, int order_number, String description, Date create_time) {
		super();
		this.name = name;
		this.state = state;
		this.order_number = order_number;
		this.description = description;
		this.create_time = create_time;
	}
	private Date create_time;
	public category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public int getOrder_number() {
		return order_number;
	}
	public void setOrder_number(int order_number) {
		this.order_number = order_number;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	@Override
	public String toString() {
		return "category [cid=" + cid + ", name=" + name + ", state=" + state + ", order_number=" + order_number
				+ ", description=" + description + ", create_time=" + create_time + "]";
	}
	
}
