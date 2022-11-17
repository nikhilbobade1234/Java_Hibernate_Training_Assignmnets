package com.exceptionhandling.assignment1;
public class Student {
int rollno;
String sname;
String saddress;
studentresult srobj=new studentresult();
public int getRollno() {
	return rollno;
}
public void setRollno(int rollno) {
	this.rollno = rollno;
}
public String getSname() {
	return sname;
}
public void setSname(String sname) {
	this.sname = sname;
}
public String getSaddress() {
	return saddress;
}
public void setSaddress(String saddress) {
	this.saddress = saddress;
}
public studentresult getSrobj() {
	return srobj;
}
public void setSrobj(studentresult srobj) {
	this.srobj = srobj;
}
public Student(int rollno, String sname, String saddress) {
	super();
	this.rollno = rollno;
	this.sname = sname;
	this.saddress = saddress;
	
}
public Student() {
	super();
}
public void result() throws failexception {
	srobj.result();
	
} public static void main(String[] args) throws failexception {
	Student s=new Student(1,"ankush","pune");
	System.out.println("student name:-"+s.sname);
	s.result();
}
	

}
