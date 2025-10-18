package builderBuffer;

public class StringBuilderDemo1 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append(" World");
		System.out.println(sb1);
		
		
		sb1.delete(0, 3);
		System.out.println(sb1);
		
		sb1.insert(0, "Nepal ");
		System.out.println(sb1);
		
		sb1.delete(6, 9);
		System.out.println(sb1);
		
		sb1.reverse();
		System.out.println(sb1);
		
		
		// method chaining
		StringBuilder sb2 = new StringBuilder("Hello");
		sb2.append(" World").delete(0, 3).insert(0, "Nepal ").delete(6, 9).reverse();
		System.out.println(sb2);
	}

}
