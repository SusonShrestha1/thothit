package com.hashcode;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo1 {

	// treeset is used for sorting set elements

	public static void main(String[] args) {

		Set<Integer> tset1 = new TreeSet<>();
		System.out.println(tset1); // blank

		tset1.add(10);
		tset1.add(20);
		tset1.add(50);
		tset1.add(30);
		tset1.add(50);
		System.out.println(tset1); // Output: [10, 20, 30, 50]
									// integers and doubles sorted in their increasing order
									// no duplicate values because in default it will use same hashcode for the same
									// inputs

		Set<String> tset2 = new TreeSet<>();

		tset2.add("Suson");
		tset2.add("Sanju");
		tset2.add("Gopal");
		tset2.add("Manju");
		tset2.add("Simpson");
		tset2.add("Rajib");
		tset2.add("Rajib");

		System.out.println(tset2); // Output: [Gopal, Manju, Rajib, Sanju, Simpson, Suson]
									// Strings are sorted based on alphabetic order
									// no duplicate values because in default it will use same hashcode for the same
									// inputs
	}

}
