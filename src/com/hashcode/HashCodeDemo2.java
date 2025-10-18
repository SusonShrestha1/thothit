package com.hashcode;

public class HashCodeDemo2 {
	public static void main(String[] args) {

		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		
		System.out.println(dog1.equals(dog2)); // by default equals method compares address and returns false
		
		//hashcode will return different address but if it is overridden manually then it will return same address
		// hascode and equals methods are overriden in Dog class
		System.out.println(dog1.hashCode());
		System.out.println(dog2.hashCode());

	}

}
