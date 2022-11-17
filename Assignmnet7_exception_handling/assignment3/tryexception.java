package com.exceptionhandling.assignment3;

public class tryexception extends Exception {
private String message;

public tryexception(String message) {
	super();
	this.message = message;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

}
