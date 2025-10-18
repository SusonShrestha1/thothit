package test;

public class Question7 {

	// Q7. Polymorphism Example (Method Overloading) (OOPs – Compile-time
	// Polymorphism)
	// Description:
	// Write a class Calculator with overloaded methods add() to handle int and
	// double values.

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		
		System.out.println(calculator.add(5, 10, 20));
		System.out.println(calculator.add(5.0, 30.0));
	}

}
