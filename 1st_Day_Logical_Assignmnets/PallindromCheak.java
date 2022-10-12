package Assignments_1st_Day_Logical;

import java.util.Scanner;

public class PallindromCheak {
public static void main(String[] args) {
	int r; int temp;
	int sum=0;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter Number To cheak Pallindrome");
	int n=sc.nextInt();
	temp=n;
	while(n>0) {
		r=n%10;
		sum=(sum*10)+r;
		n=n/10;
		
		
	}
	if(temp==sum)
		System.out.println("It is Pallindrome");
	else
		System.out.println("It is Not Pallindrome");
}
}
