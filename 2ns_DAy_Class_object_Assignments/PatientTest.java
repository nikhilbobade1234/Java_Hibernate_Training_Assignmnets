package Assignment_2nd_Days;

import java.util.Scanner;

 class PatientTest {
private String patientName;
private double height;
 private double weight;
PatientTest(){
	
}
public PatientTest(String patientName, double height, double weight) {
	super();
	this.patientName = patientName;
	this.height = height;
	this.weight = weight;
}
public String getPatientName() {
	return patientName;
}
public void setPatientName(String patientName) {
	this.patientName = patientName;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getWeight() {
	return weight;
}
public void setWeight(double weight) {
	this.weight = weight;
}
public void ComputeBMI() {
	 
	double heightsq=(height * height);
	
     double ComputeBMI1 = weight /heightsq;
     System.out.print("Patient Name = "+ patientName+" \n BMI = "+ComputeBMI1 + " kg/m2");


}
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Patient Name ");
	String patientName =sc.nextLine();
	System.out.println("Enter weight in kg");
	double weight=sc.nextDouble();
	System.out.println("Enter height in meter");
	double height=sc.nextDouble();
	
	PatientTest p1=new PatientTest(patientName,height,weight);;
	p1.ComputeBMI();
	
}
}

	
