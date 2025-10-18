package test;

public class SBI implements Bank{

	@Override
	public void rateOfInterest(int percentage) {
		System.out.println("Interest rate for SBI bank is " + percentage);
	}

}
