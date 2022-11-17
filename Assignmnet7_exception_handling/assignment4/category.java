package com.exceptionhandling.assignment4;

public class category {
int catid;
String catname;
public int getCatid() {
	return catid;
}
public void setCatid(int catid) {
	this.catid = catid;
}
public String getCatname() {
	return catname;
}
public void setCatname(String catname) {
	this.catname = catname;
}
public category(int catid, String catname) {
	super();
	this.catid = catid;
	this.catname = catname;
}
public category() {
	super();
	// TODO Auto-generated constructor stub
}
}
