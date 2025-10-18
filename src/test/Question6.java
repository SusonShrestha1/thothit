package test;

import java.util.Scanner;

public class Question6 {
	// Q6. Abstraction Example (Shape Class) (OOPs – Abstraction)
	// Description:
	// Create an abstract class Shape with abstract method area().
	// Implement it in Circle and Rectangle.

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter the radius: ");
		double radius = scanner.nextDouble();
		System.out.print("Please enter the length: ");
		double length = scanner.nextDouble();
		System.out.print("Please enter the breadth: ");
		double breadth = scanner.nextDouble();

		Circle circle = new Circle(radius);
		System.out.println("The area of the circle is: " + circle.area());

		Rectangle rect = new Rectangle(length, breadth);
		System.out.println("The area of the rectangle is: " + rect.area());

		scanner.close();
	}

}
