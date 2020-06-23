package com.dami.orders.bean;

import com.dami.user.bean.user;

import java.util.Date;

public class orders {
	private String orders_number;
	private int uid;
	private user u;
	public user getU() {
		return u;
	}
	public void setU(user u) {
		this.u = u;
	}
	private double sum_price;
	private int state;
	private Date create_time;
	private int count_number;
	
	@Override
	public String toString() {
		return "orders [orders_number=" + orders_number + ", uid=" + uid + ", u=" + u + ", sum_price=" + sum_price
				+ ", state=" + state + ", create_time=" + create_time + ", count_number=" + count_number + "]";
	}
	public String getOrders_number() {
		return orders_number;
	}
	public void setOrders_number(String orders_number) {
		this.orders_number = orders_number;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public double getSum_price() {
		return sum_price;
	}
	public void setSum_price(double sum_price) {
		this.sum_price = sum_price;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	
	public orders(String orders_number, int uid, double sum_price, int state, Date create_time, int count_number) {
		super();
		this.orders_number = orders_number;
		this.uid = uid;
		this.sum_price = sum_price;
		this.state = state;
		this.create_time = create_time;
		this.count_number = count_number;
	}
	public Date getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}
	public int getCount_number() {
		return count_number;
	}
	public void setCount_number(int count_number) {
		this.count_number = count_number;
	}
	public orders() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
