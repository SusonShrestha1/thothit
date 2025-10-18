package strings;

// import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		String str = "Suson";

		String reverseStr = "";
		for (int i = 0; i < str.length(); i++) {
			char character = str.charAt(i);
			reverseStr = character + reverseStr;
		}
		System.out.println(reverseStr);
		
		/*
		 * System.out.print("Please enter a word: "); Scanner scanner = new
		 * Scanner(System.in); String str = scanner.next();
		 * 
		 * String reverseStr = ""; for (int i = 0; i < str.length(); i++) { char
		 * character = str.charAt(i); reverseStr = character + reverseStr; }
		 * System.out.println(reverseStr);
		 * 
		 * scanner.close();
		 */
	}

}
