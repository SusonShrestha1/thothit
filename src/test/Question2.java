package test;

import java.util.Scanner;

public class Question2 {

	// Q2. Check Palindrome Number (Loop + Conditional)
	// Description:
	// Write a Java program to check if a number is a palindrome.
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the number: ");
		int number = scanner.nextInt();
		
		if (isPalindrome(number)) {
			System.out.println("This number is palindrome");
		} else {
			System.out.println("This number is not palindrome");
		}

		scanner.close();
	}

	private static boolean isPalindrome(int number) {
		int originalNumber = number;
        int reverseNumber = 0;

        while (number > 0) {
            int num = number % 10;      
            reverseNumber = reverseNumber * 10 + num; 
            number = number / 10;       
        }

        return originalNumber == reverseNumber;
	}

}
