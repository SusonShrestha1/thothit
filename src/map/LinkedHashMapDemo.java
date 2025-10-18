package map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//In a LinkedHashMap:
//- linkedhash map is an ordered map and it maintains the insertion order
public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> lmap1 = new LinkedHashMap<>(); // blank linkedhashmap and used more commonly
		lmap1.put(101, "Prakash");
		lmap1.put(111, "Mohan");
		lmap1.put(100, "Deepak");
		lmap1.put(50, "Aman");

		/*
		 * // using keySet() for iteration over key for(Integer key : lmap1.keySet()) {
		 * System.out.println("Key:" + key); } // using values() for iteration over
		 * values for(String value : lmap1.values()) { System.out.println("Value:" +
		 * value); }
		 */

		// TRADITIONAL APPROACH
		for (Integer key : lmap1.keySet()) {
			System.out.println(key + " " + lmap1.get(key));
		}

		// ALTERNATIVE APPROACH

		// Printing all entries at once.
		// The output format will be [key=value, key=value, ...]
		// NOTE: LinkedHashMap does maintain any order of entries
		System.out.println(lmap1.entrySet());

		// entrySet() returns all key-value pairs as a Set
		// Each item in the Set is a Map.Entry object (holding one key and its value)
		System.out.println("Iteration using Map.Entry");
		Set<Entry<Integer, String>> setOfEntry = lmap1.entrySet(); // setOfEntry holds the set of all the entries
																	// setOfEntry is a set data type, which has multiple
																	// entries and each entries have key(Integer) and
																	// value(String)
																	// it points to the address of the set

		for (Entry<Integer, String> entry : setOfEntry) { // here entry is a variable which is a type of entry which
															// have key(Integer) and value(String)
															// entry is the varaible which points each entries of the
															// set
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}
}
