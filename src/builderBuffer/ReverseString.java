package builderBuffer;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		System.out.print("please enter the string: ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();

		// using StringBuilder
		System.out.println(new StringBuilder(str).reverse().toString());

		// using recursion
		System.out.println(reverse(str));

		// using for-loop
		String reverseStr = "";
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			reverseStr = character + reverseStr;
		}
		System.out.println(reverseStr);

		scanner.close();
	}

	public static String reverse(String str) {
		if (str.isEmpty()) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}

}
