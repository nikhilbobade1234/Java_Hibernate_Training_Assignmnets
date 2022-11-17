package com.exceptionhandling.assignment4;

public class item {
	int itemid;
	int price;
	int maxquantity;
	public item() {
		super();
		// TODO Auto-generated constructor stub
	}
	public item(int itemid, int price, int maxquantity) {
		super();
		this.itemid = itemid;
		this.price = price;
		this.maxquantity = maxquantity;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMaxquantity() {
		return maxquantity;
	}
	public void setMaxquantity(int maxquantity) {
		this.maxquantity = maxquantity;
	}
	

}
