package encapsulation;

public class Main2 {

	public static void main(String[] args) {

		Student s1 = new Student();
		s1.setId(100);
		System.out.println(s1.getId()); //100
		
		//change again id to 200
		s1.setId(-200); //accidental but not valid input
		System.out.println(s1.getId());
	}

}
