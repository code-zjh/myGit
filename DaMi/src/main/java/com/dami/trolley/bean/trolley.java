package com.dami.trolley.bean;

import com.dami.goods.bean.goods;
import com.dami.user.bean.user;

public class trolley {
	private int tid;
	private int uid;
	private user u;
	private int gid;
	private goods g;
	public user getU() {
		return u;
	}
	public void setU(user u) {
		this.u = u;
	}
	public goods getG() {
		return g;
	}
	public void setG(goods g) {
		this.g = g;
	}
	private int number;
	private String orders_number;
	public trolley() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getOrders_number() {
		return orders_number;
	}
	public void setOrders_number(String orders_number) {
		this.orders_number = orders_number;
	}
	@Override
	public String toString() {
		return "trolley [tid=" + tid + ", uid=" + uid + ", u=" + u + ", gid=" + gid + ", g=" + g + ", number=" + number
				+ ", orders_number=" + orders_number + "]";
	}
	public trolley(int uid, int gid) {
		super();
		this.uid = uid;
		this.gid = gid;
	}

	
}
