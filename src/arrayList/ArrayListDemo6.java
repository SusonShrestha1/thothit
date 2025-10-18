package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
// equals() == comparing two employees
public class ArrayListDemo6 {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Suson", 30, 2500);
		Employee employee2 = new Employee("Manju", 36, 1800);
		Employee employee3 = new Employee("Gopal", 38, 1500);
		Employee employee4 = new Employee("Manju", 34, 1800);
		
		//compare 2 objects with ==equals()
		// compare by reference by default
		//compare by content
		
		// create ArrayList of three employees
		
		List<Employee> employeeList = new ArrayList<> ();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);
		employeeList.add(employee4);
		
		System.out.println(employeeList);
		
		System.out.println(employee2.equals(employee4)); // false when equals() is not overridden
														// true when equals() is overridden in employee class
		
		//sort
		Collections.sort(employeeList);
		System.out.println("After sorting....");
		System.out.println(employeeList);
		
		// sort by name
		Collections.sort(employeeList, new SortingByNameComparator());
		System.out.println("After sorting....");
		System.out.println(employeeList);
	
	}

}
