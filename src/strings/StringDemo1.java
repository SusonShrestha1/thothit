package strings;

//String is a class in java. All strings created are object of this class
// sequence of characters
// when doing any operation with any data type and string then the final result is always string
public class StringDemo1 {

	public static void main(String[] args) {

		// Creating strings method 1
		String str1 = "Suson"; // most commonly used
		for (int i = str1.length(); i <= 0; i--) {
			String reverseStr1 = "";
			System.out.println(str1.charAt(i) + reverseStr1);
		}
		// helps to count the character in the string
		System.out.println(str1.length());
		System.out.println(str1.charAt(0)); // prints first character at given index
		System.out.println("Print the last character = " + str1.charAt(str1.length() - 1));
		System.out.println("Substrings: " + str1.substring(2)); // prints substring from the second index
		System.out.println("Substrings: " + str1.substring(0, 4)); // prints substring from 0 to 3

		System.out.println("JavaSpringHibernate".substring(1)); // Output: avaSpringHibernate
		System.out.println("JavaSpringHibernate".substring(1, 5)); // Output: avaS

		// Creating strings method 2 (Using new keyword)
		String str2 = new String("Shrestha");
		System.out.println(str2);
		
		String str3 = 2 + 3 + "Suson";
		System.out.println(str3); // Output: 5Suson

		String str4 = 2 + 3 + "Suson" + 2;
		System.out.println(str4); // Output: 5Suson2

		String str5 = 2 + 3 + "Suson" + 2 + 3;
		System.out.println(str5); // Output: 5Suson23

	}

}
