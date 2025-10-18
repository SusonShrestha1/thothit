package day3;

import java.util.Scanner;

public class IfElseDemo2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the number1: ");
		int number1 = scanner.nextInt();

		System.out.print("Please enter the number2: ");
		int number2 = scanner.nextInt();

		// Check if a Number is Even or Odd
		if (number1 % 2 == 0 && number2 % 2 == 0) {
			System.out.println("Both numbers are even number");
		}
		else if (number1 % 2 != 0 && number2 % 2 == 0) {
			System.out.println("number1 is odd number and number2 is even number");
		}
		else if (number1 % 2 == 0 && number2 % 2 != 0) {
			System.out.println("number1 is even number and number2 is odd number");
		}else {
			System.out.println("Both numbers are odd number");
		}

		// Find the Largest of Two Numbers
		if (number1 > number2) {
			System.out.println("Greater number is " + number1);
		} else {
			System.out.println("Greater number is " + number2);
		}
		
		// Check if a Year is Leap Year
		System.out.print("Enter the year: ");
		int year = scanner.nextInt();
		
		if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}
		
		
		// Simple Grading System
		System.out.print("Enter your grade: ");
		double grade = scanner.nextDouble();
		
		if (grade < 70) {
			System.out.println("Your letter grade is D");
		} 
		else if (grade >= 70 && grade < 80) {
			System.out.println("Your letter grade is C");
		} 
		else if (grade >= 80 && grade < 90) {
			System.out.println("Your letter grade is B");
		} else {
			System.out.println("Your letter grade is A");
		}

		scanner.close();
	}

}
