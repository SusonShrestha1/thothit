package com.hashcode;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

// HashSet does not have any particular sorting mechanism, also it randomly pick the number and place in in the set 
// Whereas TreeSet will always sorts in an ascending order

// We can also use TreeSet to sort the elements of the HashSet
// The only catch is that both TreeSet and the HashSet should be same data type
// if the HashSet is same datatype as of TreeSet then we can do the basic operation like add, remove etc.
public class TreeSetDemo3 {

	public static void main(String[] args) {

		Set<Integer> hset1 = new HashSet<>();

		hset1.add(10);
		hset1.add(20);
		hset1.add(50);
		hset1.add(30);
		hset1.add(50);
		System.out.println(hset1); // Output: [50, 20, 10, 30]

		Set<Integer> tset2 = new TreeSet<>(hset1);

		System.out.println(tset2); // Output: [10, 20, 30, 50]
		
		Set<String> hset3 = new HashSet<>();

		hset3.add("10");
		hset3.add("20");
		hset3.add("50");
		hset3.add("30");
		hset3.add("50");
		System.out.println(hset3); // Output: [50, 20, 10, 30]
		
		Set<String> tset3 = new TreeSet<>(hset3);
		tset3.add("Suson");
		tset3.add("Sanju");
		tset3.add("Gopal");
		tset3.add("Manju");
		tset3.add("Simpson");
		tset3.add("Rajib");
		tset3.add("Rajib");
		
		System.out.println(tset3); // Output: [10, 20, 30, 50, Gopal, Manju, Rajib, Sanju, Simpson, Suson]
		
		tset3.remove("Rajib");
		System.out.println(tset3); // Output: [10, 20, 30, 50, Gopal, Manju, Sanju, Simpson, Suson]
	}

}
