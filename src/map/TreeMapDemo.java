package map;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

//In a TreeMap:
//- TreeMap is sorted on the basis of keys
public class TreeMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> tmap1 = new TreeMap<>(); // blank linkedhashmap and used more commonly
		tmap1.put(101, "Prakash");
		tmap1.put(111, "Mohan");
		tmap1.put(100, "Deepak");
		tmap1.put(50, "Aman");

		/*
		 * // using keySet() for iteration over key for(Integer key : lmap1.keySet()) {
		 * System.out.println("Key:" + key); } // using values() for iteration over
		 * values for(String value : lmap1.values()) { System.out.println("Value:" +
		 * value); }
		 */

		// TRADITIONAL APPROACH
		for (Integer key : tmap1.keySet()) {
			System.out.println(key + " " + tmap1.get(key));
		}

		// ALTERNATIVE APPROACH

		// Printing all entries at once.
		// The output format will be [key=value, key=value, ...]
		// NOTE: TreeMap does maintain any order of entries
		System.out.println(tmap1.entrySet());

		// entrySet() returns all key-value pairs as a Set
		// Each item in the Set is a Map.Entry object (holding one key and its value)
		System.out.println("Iteration using Map.Entry");
		Set<Entry<Integer, String>> setOfEntry = tmap1.entrySet(); // setOfEntry holds the set of all the entries
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

		
		Map<Integer, String> tmap2 = new TreeMap<>(new SortInDescendingComparator()); // blank linkedhashmap and used more commonly
		tmap2.put(101, "Prakash");
		tmap2.put(111, "Mohan");
		tmap2.put(100, "Deepak");
		tmap2.put(50, "Aman");
		
		System.out.println(tmap2);
		
		
		int [] nums = { 1, 2, 2, 1, 3, 2, 4, 2};
		TreeMap<Integer, Integer> frequencyMap = new TreeMap<>();
		
		for(int num : nums) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		
		System.out.println(frequencyMap);
		
	}
}
