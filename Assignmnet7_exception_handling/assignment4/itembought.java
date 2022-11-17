package com.exceptionhandling.assignment4;

public class itembought {
int item_id;
int item_quantity;

	
	
public void limitexceed(int itemid,int itemquantity,int price,int catid,String catname) throws ItemPurchaseLimitExceed, exception {
	if(item_quantity>itemquantity) {
		throw new ItemPurchaseLimitExceed("item purchase limit exceed");
	
	}
	if(itemquantity==0)
	{
		throw new exception("max quantity should be greater than 1");
	}
	else
	{
		int bill=item_quantity*price;
		System.out.println("number of purchased item:- "+item_quantity);
		System.out.println("total bill:-"+bill);
		System.out.println("itemid:-"+itemid+" price:-"+price+" max Quantity:-"+itemquantity+" cat name:-"+catname+" cat id:-"+catid);
	}
	
}
public itembought() {
	super();
	
}
public int getItemid() {
	return item_id;
}
public void setItemid(int itemid) {
	this.item_id = itemid;
}public int getItemquantity() {
	return item_quantity;
}
public void setItemquantity(int itemquantity) {
	this.item_quantity = itemquantity;
}
public itembought(int itemid, int itemquantity) {
	super();
	this.item_id = itemid;
	this.item_quantity = itemquantity;
}
public static void main(String[] args) {
	item i=new item();
     
	i.setItemid(1);
	i.setPrice(50);
	i.setMaxquantity(0);
	itembought ib=new itembought();
	ib.setItemid(1);
	ib.setItemquantity(1);
	category cat=new category();
	cat.setCatid(1);
	cat.setCatname("food");
	
	try {
		ib.limitexceed(i.getItemid(),i.getMaxquantity(),i.getPrice(), cat.getCatid(),cat.catname);
	} catch (ItemPurchaseLimitExceed e) {
	System.out.println(e.getMessage());
	} catch(exception e1) {
		System.out.println(e1.getMessage()); 
	}

}
}
