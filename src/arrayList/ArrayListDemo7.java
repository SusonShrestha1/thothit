package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//equals()==comparing 2 employees
public class ArrayListDemo7 {

	public static void main(String[] args) {
		
		List<Integer> alist1=new ArrayList<>(); 		
		alist1.add(200);
		alist1.add(300);
		alist1.add(100);
		System.out.println(alist1);
		
		//iteration using for each loop
		for( Integer element  : alist1) {
			
			System.out.println(2*element);
			
		}
		System.out.println("iteration using for loop");
		for(int i=0 ; i<alist1.size();i++) {
			
			System.out.println(alist1.get(i));
			
			
		}
		System.out.println("iteration using Iterator");
		
		Iterator<Integer> itr=alist1.iterator();
		
		while(itr.hasNext()) {
			
			System.out.println(itr.next());
			
		}
		
	}

}