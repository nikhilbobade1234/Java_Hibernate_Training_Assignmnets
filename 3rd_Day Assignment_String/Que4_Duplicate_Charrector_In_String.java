package Assignmnet_3rd_Day_String;

import java.util.Scanner;

public class Que4_Duplicate_Charrector_In_String {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter String name to find Duplicate");
	String str=sc.next();
	
	  int count = 0;
	  char[] input = str.toCharArray();
	  System.out.println("Duplicate Characters are:");
	  for (int i = 0; i < str.length(); i++) {
	   for (int j = i + 1; j < str.length(); j++) {
	    if (input[i] == input[j]) {
	     System.out.println("Duplicate Charrector from "+str+" is = "+input[j]);
	     count++;
	     break;
	    }
	   }
	  
	 }
}
}
