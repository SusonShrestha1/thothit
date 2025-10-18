package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo4 {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Suson", 30, 2500);
		Employee employee2 = new Employee("Sanju", 26, 3500);
		Employee employee3 = new Employee("Gopal", 38, 1500);
		
		// create ArrayList of three employees
		
		List<Employee> employeeList = new ArrayList<> ();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		
		System.out.println(employeeList);
		
		
	}

}
