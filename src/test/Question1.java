package test;

import java.util.Scanner;

//Q1. Reverse a String (Basic String Handling)
//Description:
//Write a Java program to reverse a given string without using built-in reverse functions.

public class Question1 {

	public static void main(String[] args) {
		System.out.print("Please enter the string: ");

		Scanner scanner = new Scanner(System.in);

		String str = scanner.next();
		String reverseStr = " ";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			reverseStr = ch + reverseStr;
		}

		System.out.println(reverseStr);
		scanner.close();
	}

}
