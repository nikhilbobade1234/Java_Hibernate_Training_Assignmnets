package com.exceptionhandling.assignment3;

public class tryResource {
int id;
String name;
int address;
public int getId() {
	return id;
}
public void setId(int id) throws tryexception {
	if(id<1) {
		throw new tryexception("id should be greater than 1");
	} else
	this.id = id;
}
public String getName() {
	
	return name;
}
public void setName(String name) throws tryexception {
	if(name.length()<1) {
		throw new tryexception("name should be contains more than one character");
	}
	
	this.name = name;
}
public int getAddress() {
	return address;
}
public void setAddress(int address) {
	this.address = address;
}

public static void main(String[] args) {
	tryResource t=new tryResource();
	try {
		t.setId(0);
		t.setName("");
	} catch (tryexception e) {
		System.out.println(e.getMessage());
	}
	
	try {
		t.setId(0);
	}catch(tryexception e2) {
		System.out.println(e2.getMessage());
	}
	try {
		t.setName("1");
	}catch(tryexception e3) {
		System.out.println(e3.getMessage());
	}
	finally {
		System.out.println("try catch demostration");
	}
	}
	
}

