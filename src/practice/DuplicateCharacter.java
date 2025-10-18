package practice;

import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacter {
	
	//Problem: return true if any value appears more than once 

	public static void main(String[] args) {
		
		/* Here the element of an array will be added to the hashset
		 * but the nature of hashset, it can only take the entry without duplication
		 * and when the duplication will appear, it will result false */
		int [] nums = {1, 2, 3, 4, 2};
		Set<Integer> seen = new HashSet<>();
		
		for(int num : nums) {
			if(!seen.add(num)) {
				System.out.println("The duplicate integer is: " + num);
				break;
			}
		}
		
		//testing git lesson
	}

}
