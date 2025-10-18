package com.hashcode;

public class HashCodeDemo1 {
	
	/*
	 * all the new object has same content and
	 * String class overrides hashCode() to produce the same value for equal content.
	 */

	public static void main(String[] args) {
		
		String s1 = new String("Donald");
		System.out.println(s1.hashCode()); // 2052666774
		
		String s2 = new String("Donald");
		System.out.println(s2.hashCode()); // 2052666774
		
		System.out.println(s1.equals(s2)); // true
		
		String s3 = new String("Donald");
		System.out.println(s3.hashCode()); // 2052666774
	}

}
