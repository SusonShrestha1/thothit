package exception.handling;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		try {
			int num1 = 100, num2 = 0;

			System.out.println(num1 / 2); // Output: 50

			System.out.println(num1 / num2); // Output: exception thrown (arithmetic exception)
			System.out.println("Any Exception?");
		} catch (NullPointerException e) {
			System.out.println("Null pointer exception handled");
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic exception handled");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			System.out.println("Will handle at the end no matter what");
		}

		System.out.println("end of program");
	}

}
