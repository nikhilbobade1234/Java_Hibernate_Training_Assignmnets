package com.nikhil.demo;

import java.util.Scanner;

public class PrimeNUmber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number");
	int n=sc.nextInt();
	int count=0;
	
	for(int i=2;i<n;i++) {
		if(n%i==0) {
			count=1;
			
		}
	}
	if (count==0)
		System.out.println("number is Prime");
	else
		System.out.println("Number is not prime");
}
}
