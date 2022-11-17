package Assignment_4th_Day_Collection_Assignments;

import java.util.Collections;
import java.util.Vector;

public class Que5_Using_Vector {
public static void main(String[] args) {
	Vector<Integer> slist=new Vector<>();
	slist.add(6787);
	slist.add(234);
	slist.add(1223342);
	slist.add(12342);
	Collections.sort(slist);
	System.out.println(slist);
}
}
