package exception.handling;
// when exception comes program abnormally terminates and does not continue further
public class ExceptionDemo1 {

	public static void main(String[] args) {

		int num1 = 100, num2 = 0;
		
		System.out.println(num1/2); //Output: 50
		
		System.out.println(num1/num2); //Output: exception thrown (arithmetic exception)
		
		System.out.println("end of program");
	}

}
