package test;

public class Question4 {

	// Q4. Inheritance Example (Car and Vehicle) (OOPs – Inheritance)
	// Description:
	// Create a parent class Vehicle with a method start().
	// Create a child class Car that extends Vehicle and overrides the method.

	public static void main(String[] args) {

		Vehicle vehicle = new Vehicle();
		vehicle.start();
		
		Car car = new Car();
		car.start();
	}

}
