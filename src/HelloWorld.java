import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Hello my name is Suson");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int num1 = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int num2 = scanner.nextInt();
		
		int sum = num1 + num2;
		
		System.out.println("The sum of two numbers is " + sum);
		scanner.close();
	}

}
