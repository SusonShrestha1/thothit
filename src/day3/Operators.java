package day3;

// arithmetic operations : +, -, /, *, % (modulus), ++,  --, >, <, == (comparison), = (assignment operator)
public class Operators {

	public static void main(String[] args) {

		int numberOne = 10;
		int numberTwo = 20;
		int numberThree = 22;
		int numberFour = 10;

		System.out.println(numberOne / numberTwo);

		System.out.println(numberTwo / numberOne);

		System.out.println(numberOne % numberTwo); //10

		System.out.println(numberTwo % numberOne); //0
		
		System.out.println(numberThree % numberOne);
		
		System.out.println(numberOne == numberTwo);
		
		System.out.println(numberOne == numberFour);
		
		System.out.println(numberOne < numberFour);
		
		System.out.println(numberOne <= numberFour);
	}

}
