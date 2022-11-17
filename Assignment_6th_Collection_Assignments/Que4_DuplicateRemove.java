package Assignment_4th_Day_Collection_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Que4_DuplicateRemove {
	public static void main(String[] args) {
		List<String> slist = new ArrayList<>();
		slist.add("Nikhil");
		slist.add("Nikhil");
		slist.add("Vinod");
		slist.add("Arjun");
		System.out.println("Before Removal of Duplication");
		System.out.println(slist);
		for (int i = 0; i < slist.size(); i++) {
			for (int j = i + 1; j < slist.size(); j++) {
				if (slist.get(i).equals(slist.get(j))) {
					slist.remove(j);
					j--;
				}

			}
			

		}
		System.out.println("After Removal of Duplication");
		System.out.println(slist);
		System.out.println("Ascending Order ");
		Collections.sort(slist);
		System.out.println(slist);
		System.out.println("Descending Order ");
		Collections.reverse(slist);
		System.out.println(slist);
	}
}
