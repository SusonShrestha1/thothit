package map;

import java.util.HashMap;
import java.util.Map;

// In hashmap, values can be duplicate but the key cannot be duplicate.
// If the key is duplicate then the new value will replace the old value
// In the hashmap ordering is not gaurented, if need order then we can use linkedhashmap

public class HashMapDemo1 {

	public static void main(String[] args) {
		
		// HashMap<Integer, String> hmap1 = new HashMap<>(); // blank hashmap
		Map<Integer, String> hmap1 = new HashMap<>(); // blank hashmap and used more commonly
		hmap1.put(101, "Prakash");
		hmap1.put(111, "Mohan");
		hmap1.put(100, "Deepak");
		hmap1.put(50, "Mohan");
		hmap1.put(50, "Aman");
		
		System.out.println(hmap1);
		
		Map<String, String> hmap2 = new HashMap<>(); // blank hashmap and used more commonly
		hmap2.put("101", "Prakash");
		hmap2.put("111", "Mohan");
		hmap2.put("100", "Deepak");
		hmap2.put("50", "Mohan");
		hmap2.put("50", "Aman");
		
		System.out.println(hmap2);
	}
}
