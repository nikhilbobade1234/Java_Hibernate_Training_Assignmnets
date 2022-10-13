package Assignmnet_3rd_Day_String;

import java.util.Scanner;

public class Que3_RemovoingVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter word for romoving vowels");
		String s = sc.next();
		String R="";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {

			} else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {

			} else if (s.charAt(i) == 'i' || s.charAt(i) == 'I') {

			} else if (s.charAt(i) == 'o' || s.charAt(i) == 'O') {

			} else if (s.charAt(i) == 'u' || s.charAt(i) == 'U') {

			} else {
				R = R + s.charAt(i);
			}
		}
		System.out.println(R);
	}
}
