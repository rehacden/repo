package tests;

public class Foo {

	Integer i;

	int j;

	public static void main(String[] args) {

		Foo t = new Foo();

		t.go();

	}

	public void go() {

		j = i;

		System.out.println(j);

		System.out.println(i);

	}
}