package javaConcepts;

public class MethodWithReturnType {
	public static void main(String[] args) {

		System.out.println(test());
		System.out.println(test1());
		System.out.println(test2());

	}

	static int test() {
		return 7;
	}

	static char test1() {
		return '@';
	}

	static boolean test2() {
		return false;
	}

}
