package com.hashcode;

import java.util.Set;
import java.util.TreeSet;
// sort on the basis of string length on ascending order

public class TreeSetDemo4 {

	public static void main(String[] args) {
		
		Set<String> tset3 = new TreeSet<>(new SortLengthComparator());
		tset3.add("deepa");
		tset3.add("mona");
		tset3.add("prakash");
		tset3.add("soojan");
		tset3.add("simpson1");
		
		System.out.println(tset3); 
		
		
	}

}
