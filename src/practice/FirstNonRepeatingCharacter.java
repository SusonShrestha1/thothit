package practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		String s = "swiss";

		Map<Character, Integer> count = new LinkedHashMap<>();

		/*
		 * First String is divided in characters and added in an array Then the
		 * frequency of each character is calculated
		 */
		for (char c : s.toCharArray()) {
			count.put(c, count.getOrDefault(c, 0) + 1);
		}

		/*
		 * entry will take the key and value of the count one by one if the
		 * entry.getValue() gets the value 1 then it will print the statement and print
		 * the key for that value then breaks the statement
		 */
		for (Map.Entry<Character, Integer> entry : count.entrySet()) {
			if (entry.getValue() == 1) {
				System.out.println("First non-repeating character: " + entry.getKey());
				break;
			}
		}
	}


}
