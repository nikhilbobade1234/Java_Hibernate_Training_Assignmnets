package com.exceptionhandling.assignment1;

public class failexception extends Exception
{
private String message;

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
	
}

public failexception(String message) {
	super();
	this.message = message;
}
}
