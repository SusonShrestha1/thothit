package interface2;

import java.util.Arrays;

public class SortDescending implements Sorting {

	@Override
	public void sort(int[] arr) {
		
		if (arr != null && arr.length > 0) {
			System.out.println("Sorting an array in an descending order...");
			
			for (int i = 0; i < arr.length-1; i++) {
				for (int j = 0; j < arr.length-1-i; j++) {
					if (arr[j]< arr[j+1]) {
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
			System.out.println("Sorted array: " + Arrays.toString(arr));
		} else {
			System.out.println("Error loading an array");
		}
	}

}
