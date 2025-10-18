package com.hashcode;

import java.util.Set;
import java.util.TreeSet;

// sorting TreeSet in descending order using comparator
public class TreeSetDemo2 {

	public static void main(String[] args) {

		Set<Integer> tset1 = new TreeSet<>();
		tset1.add(10);
		tset1.add(20);
		tset1.add(50);
		tset1.add(30);
		tset1.add(50);
		System.out.println(tset1); // Output: [10, 20, 30, 50]

		Set<Integer> sortDescending = new TreeSet<>(new SortDescendingComparator());
		sortDescending.addAll(tset1); // will add all the element of tset1 to the sortDescending object
		System.out.println(sortDescending); // Output: [50, 30, 20, 10]
		
		//Collections.sort(tset1); this is only for the list not for the set

	}

}
