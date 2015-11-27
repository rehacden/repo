package chapter11;

public class ExTestDrive {
	public static void main(String[] args) {
		String test = args[0];
		System.out.print("t");
		System.out.print("h");
		try {
			doRisky(test);
			System.out.print("r");
			System.out.print("o");
		} catch (MyEx e) {
		} finally {
			System.out.print("w");
			System.out.println("s");
		}

	}

	private static void doRisky(String t) throws MyEx {
		if ("yes".equals(t)) {
			System.out.print("a");
			throw new MyEx();
		}
	}
}
