package Assignment_4th_Day_Collection_Assignments;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


public class Que1_Ascending_order {
public static void main(String[] args) {
	List<Integer>slist=new ArrayList<>();
	slist.add(50);
	slist.add(30);
	slist.add(10);
	slist.add(40);
	slist.add(20);
	
	Collections.sort(slist);
	for(Integer s:slist)
		System.out.println(s);
	}
}

