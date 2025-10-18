package com.hashcode;
import java.util.HashSet;
import java.util.Set;

// <> is known as generics used for type safety

public class HashSetDemo1 {

	public static void main(String[] args) {
		Set<Integer> hset1 = new HashSet<>();
		System.out.println(hset1); //blank
		
		// because of hashset nature, it will not return duplicate value and does not gaurentee that it will be in order
		hset1.add(10);
		hset1.add(20);
		hset1.add(30);
		hset1.add(10);
		System.out.println(hset1);
		
		Set<String> hset2 = new HashSet<>();
		hset2.add("mango");
		hset2.add("apple");
		hset2.add("banana");
		hset2.add("orange");
		hset2.add("mango");
		System.out.println(hset2);
		
	}

}
