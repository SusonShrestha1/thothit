package arrayList;

import java.util.LinkedList;
import java.util.List;

// <> is known as generics used for type safety

public class LinkedListDemo1 {

	public static void main(String[] args) {
		List<Integer> arrayList1 = new LinkedList<>();
		arrayList1.add(10);
		arrayList1.add(20);
		arrayList1.add(30);
		arrayList1.add(15);
		System.out.println(arrayList1);
		
	}

}
