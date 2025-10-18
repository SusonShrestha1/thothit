package interface1;

public class TV implements RemoteControl{

	@Override
	public void powerOn() {
		System.out.println("Turn on the TV");
	}

	@Override
	public void powerOff() {
		System.out.println("Turn off the TV");		
	}

	@Override
	public void volumeUp() {
		System.out.println("Increase the volume of TV");	
	}

	@Override
	public void volumeDown() {
		System.out.println("Decrease the volume of TV");	
	}


}
