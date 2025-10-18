package test;

import java.util.Scanner;

public class Question3 {
	// Q3. Factorial Using Recursion (Recursion Concept)
	// Description:
	// Write a Java program to find factorial of a number using recursion.

	public static void main(String[] args) {
		System.out.print("Please eneter the number for factorial: ");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		int result = factorial(number);

		System.out.println("The factorail of the entered number is " + result);
		scanner.close();
	}

	static int factorial (int num) {
		if (num == 0 || num == 1) {
			return 1;
		} else {
			return num * factorial(num-1) ;
		}
	}

}
