package encapsulation;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		// System.out.println(student1.name); ***Error***
		System.out.println(student1.getName());
		System.out.println(student1.getPassword());
		
		student1.setAge(30);
		System.out.println(student1.getAge());
	}

}
