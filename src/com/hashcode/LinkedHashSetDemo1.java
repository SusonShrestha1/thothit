package com.hashcode;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo1 {
	
	//LinkedHashSet maintains order of the set

	public static void main(String[] args) {

		Dog1 dog1 = new Dog1("tommy", 11, "black", 200);
		Dog1 dog2 = new Dog1("sandy", 5, "white", 300);
		Dog1 dog3 = new Dog1("oliver", 1, "brown", 600);
		Dog1 dog4 = new Dog1("jack", 2, "black", 500);
		Dog1 dog5 = new Dog1("sandy", 5, "white", 300);

		// HashSet<Dog1> hset1 = new HashSet<>();
		//Set<Dog1> hset1 = new HashSet<>();
		Set<Dog1> hset1 = new LinkedHashSet<>();

		hset1.add(dog1);
		hset1.add(dog2);
		hset1.add(dog3);
		hset1.add(dog4);
		hset1.add(dog5);

		System.out.println(hset1);

		// search
		System.out.println(hset1.contains(new Dog1("jack", 2, "black", 500)));

	}

}
