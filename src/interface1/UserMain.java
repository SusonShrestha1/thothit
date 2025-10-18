package interface1;

public class UserMain {

	public static void main(String[] args) {

		RemoteControl rc = new TV();
		rc.powerOn();
		rc.volumeUp();
		rc.volumeDown();
		rc.powerOff();
		
		RemoteControl rc2 = new AC();
		rc2.powerOn();
		rc2.powerOff();
	}

}
