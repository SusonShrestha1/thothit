package interface1;

public class AC implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Turn on the AC");
	}

	@Override
	public void powerOff() {
		System.out.println("Turn off the AC");		
	}

	@Override
	public void volumeUp() {
		System.out.println("Increase the temp of AC");	
	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease the temp of AC");	
	}

}
