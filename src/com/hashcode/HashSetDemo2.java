package com.hashcode;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// <> is known as generics used for type safety

public class HashSetDemo2 {

	public static void main(String[] args) {
		Set<Integer> hset1 = new HashSet<>();
		System.out.println(hset1); //blank
		
		// because of hashset nature, it will not return duplicate value and does not gaurentee that it will be in order
		hset1.add(10);
		hset1.add(20);
		hset1.add(30);
		hset1.add(10);
		System.out.println(hset1);
		
		
		// using for each loop
		for(Integer element :hset1) {
			System.out.println(element);
		}
		
		// using for loop is not possible
		System.out.println("-----------------------");
		
		// using iterator
		Iterator <Integer> itr = hset1.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}
	}

}
