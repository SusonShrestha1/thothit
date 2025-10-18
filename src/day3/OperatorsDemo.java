package day3;

public class OperatorsDemo {

	public static void main(String[] args) {

		boolean a = true;
		boolean b = false;
		
		int age = 25;
		boolean hasId = true;

		System.out.println("a && b = " + (a && b)); // Output is false

		System.out.println("a || b = " + (a || b)); // Output is true

		System.out.println("!a = " + !a); // Output is false
		
		// System.out.println("!a = " + !age); // Output is error because ! is not used for the integer only for logical operation

		System.out.println(age >= 18 && hasId); // Output is true
		
	}

}
