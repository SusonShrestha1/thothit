package day5;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		int length = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("What will be the lenght of your array?");
		System.out.print("lenght: ");
		length = scanner.nextInt();

		int[] arr = new int[length];

		// assigning element to an array
		for (int i = 0; i < arr.length; i++) {
			System.out.print("arr[" + i + "]: ");
			arr[i] = scanner.nextInt();
		}

		// printing an element
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + " element is: " + arr[i]);

		}

		scanner.close();
	}

}
