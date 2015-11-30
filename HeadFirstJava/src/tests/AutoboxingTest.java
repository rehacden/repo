package tests;

public class AutoboxingTest {
	
	public static void main(String[] args) {
		Integer a = new Integer(3);
		Integer b = new Integer(3);
	
		if (a == b) {
			System.out.println("equal");
		} else {
			System.out.println("NOT equal");
		}
	}
}
