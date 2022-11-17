package Assignment_4th_Day_Collection_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Que2_Binarysearch {
	public static void main(String[] args) {
		List<Integer> slist = new ArrayList<>();

		slist.add(10);
		slist.add(20);
		slist.add(40);
		slist.add(50);
		slist.add(60);
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter the Number");
		int i1 = Collections.binarySearch(slist, sc.nextInt());
		System.out.println(" Binary search = " + i1);

	}
}
