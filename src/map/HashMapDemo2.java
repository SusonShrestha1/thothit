package map;

import java.util.HashMap;
import java.util.Map;

// In hashmap, values can be duplicate but the key cannot be duplicate.
// If the key is duplicate then the new value will replace the old value
// In the hashmap ordering is not gaurented, if need order then we can use linkedhashmap

public class HashMapDemo2 {

	public static void main(String[] args) {
		
		// HashMap<Integer, String> hmap1 = new HashMap<>(); // blank hashmap
		Map<Integer, String> hmap1 = new HashMap<>(); // blank hashmap and used more commonly
		hmap1.put(101, "Prakash");
		hmap1.put(111, "Mohan");
		hmap1.put(100, "Deepak");
		hmap1.put(50, "Aman");
		hmap1.put(50, "Mohan");
		
		System.out.println(hmap1); // elements in the hashmap [key and value]
		
		System.out.println(hmap1.get(100)); // Output: gives the value stored in the key
		
		System.out.println(hmap1.containsKey(500)); // looks for the key in the hashmap and return boolean value
		System.out.println(hmap1.containsKey(50));
		System.out.println(hmap1.containsValue("Suson"));
		System.out.println(hmap1.containsValue("Aman"));
		System.out.println(hmap1.containsValue("Prakash"));
		
		System.out.println(hmap1.size()); // gives the total number of the elements in the hashmap
		
		System.out.println(hmap1.keySet()); // it will return set of keys in the hashmap
		
		System.out.println(hmap1.values()); // it will return set of values in the hashmap
		
	}
}
