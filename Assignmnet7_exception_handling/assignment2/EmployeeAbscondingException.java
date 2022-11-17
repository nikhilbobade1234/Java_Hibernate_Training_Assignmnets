package com.exceptionhandling.assignment2;

public class EmployeeAbscondingException extends Exception {
private String messge;

public EmployeeAbscondingException(String messge) {
	super();
	this.messge = messge;
}

public String getMessge() {
	return messge;
}

public void setMessge(String messge) {
	this.messge = messge;
}
}
