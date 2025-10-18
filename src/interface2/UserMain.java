package interface2;

public class UserMain {

	public static void main(String[] args) {
		int[] array = {30,50,10,20,40};
		
		//sorting in ascending order
		Sorting sorting1 = new SortAscending();
		sorting1.sort(array);
		
		//sorting in descending order
		Sorting sorting2 = new SortDescending();
		sorting2.sort(array);
	}

}
