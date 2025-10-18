package test;

public class HDFC implements Bank {

	@Override
	public void rateOfInterest(int percentage) {
		System.out.println("Interest rate for HDFC bank is " + percentage);		
	}

}
