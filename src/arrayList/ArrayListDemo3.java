package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {

		List<Integer> arrayList1 = new ArrayList<>(); 
		arrayList1.add(20);
		arrayList1.add(30);
		arrayList1.add(40);
		System.out.println(arrayList1); // [20, 30, 40]
		
		System.out.println(arrayList1.get(0)); // 20
		System.out.println(arrayList1.get(2)); // 40
		System.out.println(arrayList1.size()); // 3
		
		System.out.println(arrayList1.remove(2)); //  removes 40
		System.out.println(arrayList1); // [20, 30]
		
		//searching for the element; returns either true or false
		System.out.println(arrayList1.contains(20)); // true
		System.out.println(arrayList1.contains(40)); // false
		
		// sort
		arrayList1.add(10);
		arrayList1.add(15);
		arrayList1.add(7);
		System.out.println(arrayList1); //[20, 30, 10, 15, 7]
		Collections.sort(arrayList1);
		System.out.println(arrayList1); // [7, 10, 15, 20, 30]

	}

}
