package com.nikhil.demo;

import java.util.Scanner;

public class ReversePatterNumber {
public static void main(String[] args) {
	int i,j;
    
    Scanner sc = new Scanner(System.in);
   
    System.out.print("Enter the Numbers = ");
    int r = sc.nextInt();
    
    for(i=1;i<=r;i++)
    {
        
        for(j=i;j<=r;j++)
            System.out.print(" ");
        
        for(j=1;j<=i;j++)
            System.out.print(j+"");
        
        for(j=i-1;j>=1;j--)
            System.out.print(j+"");
        System.out.println();
     }
}
}

