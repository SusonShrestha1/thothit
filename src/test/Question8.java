package test;

public class Question8 {
	// Q8. Interface Example (Bank Interface) (OOPs – Interface)
	// Description:
	// Create an interface Bank with method rateOfInterest().
	// Implement it in SBI and HDFC classes.

	public static void main(String[] args) {
		int interestRateSBI = 2;
		int interestRateHDFC = 5;

		Bank bank1 = new SBI();
		bank1.rateOfInterest(interestRateSBI);

		Bank bank2 = new HDFC();
		bank2.rateOfInterest(interestRateHDFC);

	}

}
