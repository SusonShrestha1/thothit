package com.hashcode;

import java.util.Comparator;

public class SortLengthComparator implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length(); // ascending order
		// return s2.length() - s1.length(); //descending order
	}

}
