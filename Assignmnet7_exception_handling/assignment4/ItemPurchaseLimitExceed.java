package com.exceptionhandling.assignment4;

public class ItemPurchaseLimitExceed extends Exception {
String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public ItemPurchaseLimitExceed() {
	super();
	// TODO Auto-generated constructor stub
}

public ItemPurchaseLimitExceed(String message) {
	super();
	this.message = message;
}
}
