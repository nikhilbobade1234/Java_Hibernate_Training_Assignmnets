package com.exceptionhandling.assignment4;

public class exception extends Exception {
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public exception(String message) {
	super();
	this.message = message;
}

public exception() {
	super();
	// TODO Auto-generated constructor stub
}

}
