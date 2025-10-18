package practice;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 4, 2, 2, 3, 3, 3, 3, 4 };
		int maxFreq = 0, result = -1;
		
		/*Here in the freq hashmap, ferquency of each element is counted and then added in the hashmap
		 * also at the same time the frequency is updated if the count is greter than maxfrequency */

		Map<Integer, Integer> freq = new HashMap<>();
		for (int num : nums) {
			int count = freq.getOrDefault(num, 0) + 1;
			freq.put(num, count);
			if (count > maxFreq) {
				maxFreq = count;
				result = num;
			}
		}
		System.out.println("The most frequent element is " + result + " and it's frequency is " + maxFreq);
	}

}
