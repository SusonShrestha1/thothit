package builderBuffer;

public class StringBuilderDemo2 {

	public static void main(String[] args) {

		StringBuilder sb1 = new StringBuilder("Hello");
		StringBuilder sb2 = new StringBuilder("Hello");
		//convert StringBuilder to String
		String str = sb1.toString();
		
		
		// compare contents of 2 different StringBuilder Object
		System.out.println(sb1.equals(sb2)); // Output: false
		// equals() compares addresses of the objects by default
		// StringBuilder does not override equals()
		System.out.println(sb1.toString().equals(sb2.toString())); // converts to string and compare the content
	}

}
