package com.dami.goods.bean;

import com.dami.category.bean.category;

import java.util.Date;

public class goods {
	private int gid;
	private int cid;
	private String gname;
	private String color;
	private String size;
	private double price;
	private String description;
	private String full_description;
	private String pic;
	private int state;
	private String version;
	private Date product_date;
	private category cate;
	
	public goods(int cid, String gname, String color, String size, double price, String description,
			String full_description, String pic, int state, String version, Date product_date) {
		super();
		this.cid = cid;
		this.gname = gname;
		this.color = color;
		this.size = size;
		this.price = price;
		this.description = description;
		this.full_description = full_description;
		this.pic = pic;
		this.state = state;
		this.version = version;
		this.product_date = product_date;
	}
	public goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public goods(int gid, int cid, String gname, String color, String size, double price, String description,
			String full_description, String pic, int state, String version, Date product_date) {
		super();
		this.gid = gid;
		this.cid = cid;
		this.gname = gname;
		this.color = color;
		this.size = size;
		this.price = price;
		this.description = description;
		this.full_description = full_description;
		this.pic = pic;
		this.state = state;
		this.version = version;
		this.product_date = product_date;
	}
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getFull_description() {
		return full_description;
	}
	public void setFull_description(String full_description) {
		this.full_description = full_description;
	}
	public String getPic() {
		return pic;
	}
	public void setPic(String pic) {
		this.pic = pic;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Date getProduct_date() {
		return product_date;
	}
	public void setProduct_date(Date product_date) {
		this.product_date = product_date;
	}
	public category getCate() {
		return cate;
	}
	public void setCate(category cate) {
		this.cate = cate;
	}
	@Override
	public String toString() {
		return "goods [gid=" + gid + ", cid=" + cid + ", gname=" + gname + ", color=" + color + ", size=" + size
				+ ", price=" + price + ", description=" + description + ", full_description=" + full_description
				+ ", pic=" + pic + ", state=" + state + ", version=" + version + ", product_date=" + product_date
				+ ", cate=" + cate + "]";
	}
	
	
}
