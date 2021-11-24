package javaConcepts;

public class MethodWithArgument {

	public static void test1(int x) {
		System.out.println(x);
	}

	public static void test2(int i, double j) {
		System.out.println(i);
		System.out.println(j);
	}

	public static void test3(String s) {
		System.out.println(s);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1(6);
		test2(8,5.6);
		test3("sql");
	}
}
