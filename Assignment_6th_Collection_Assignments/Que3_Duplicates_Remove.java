package Assignment_4th_Day_Collection_Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Que3_Duplicates_Remove {
	public static void main(String[] args) {
		List<Integer> slist = new ArrayList<>();
		slist.add(34);
		slist.add(34);
		slist.add(26);
		slist.add(12);
		slist.add(24);
		slist.add(34);
//	List<Integer> aslist = slist.stream().distinct().collect(Collectors.toList());
//	Collections.sort(aslist);
//	for(Integer s1:aslist) {
//	System.out.println(s1);

		for (int i = 0; i < slist.size(); i++) {
			for (int j = i+1; j < slist.size(); j++) {
				if (slist.get(i) == slist.get(j)) {
					slist.remove(j);
				}
			}

		}
		System.out.println(slist);
		Collections.sort(slist);
		for(Integer slist1:slist) {
			System.out.print(slist1+", ");
		}

	}
}
