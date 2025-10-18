package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

//In a HashMap:
//- Keys must be unique
//- Values can be duplicated
//- If the same key is added again, the new value will replace the old one
//- HashMap does not keep any order of elements (if you want order, use LinkedHashMap)
public class HashMapDemo3 {

	public static void main(String[] args) {

		// HashMap<Integer, String> hmap1 = new HashMap<>(); // blank hashmap
		Map<Integer, String> hmap1 = new HashMap<>(); // blank hashmap and used more commonly
		hmap1.put(101, "Prakash");
		hmap1.put(111, "Mohan");
		hmap1.put(100, "Deepak");
		hmap1.put(50, "Aman");

		/*
		 * // using keySet() for iteration over key for(Integer key : hmap1.keySet()) {
		 * System.out.println("Key:" + key); } // using values() for iteration over
		 * values for(String value : hmap1.values()) { System.out.println("Value:" +
		 * value); }
		 */

		// TRADITIONAL APPROACH
		for (Integer key : hmap1.keySet()) {
			System.out.println(key + " " + hmap1.get(key));
		}

		// ALTERNATIVE APPROACH

		// Printing all entries at once.
		// The output format will be [key=value, key=value, ...]
		// NOTE: HashMap does not maintain any order of entries
		System.out.println(hmap1.entrySet());

		// entrySet() returns all key-value pairs as a Set
		// Each item in the Set is a Map.Entry object (holding one key and its value)
		System.out.println("Iteration using Map.Entry");
		Set<Entry<Integer, String>> setOfEntry = hmap1.entrySet(); // setOfEntry holds the set of all the entries
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
