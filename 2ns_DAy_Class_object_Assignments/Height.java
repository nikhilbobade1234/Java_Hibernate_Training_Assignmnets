package Assignment_2nd_Days;

import java.util.Scanner;

public class Height {
	private int inches;
	private int feet;

	public Height() {
		super();
	}

	public Height(int inches, int feet) {
		super();
		this.inches = inches;
		this.feet = feet;
	}
	
	
public void Get() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Inches");
	inches =sc.nextInt();
	System.out.println("Enter Feets");
	feet=sc.nextInt();
	
}
public void display() {
	System.out.println("Feet "+feet+", Inches = "+inches);
}
public void AddHeights(Height h1,Height h2) {
	inches=h1.inches+h2.inches;
	feet =h1.feet+h2.feet+(inches/12);
	inches=feet*12;
}
public static void main(String[] args) {
	Height h1=new Height();
	Height h2=new Height();
	Height h3=new Height();
	System.out.println("Enter first Height");
	h1.Get();
	System.out.println("Enter Second Height");
	h2.Get();
	h3.AddHeights(h1, h2);
	System.out.println("Total Height");
	h3.display();
}
}
