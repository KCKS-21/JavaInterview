package javaConcepts;

public class LocalAndGlobalvariableCalling {
	static int a = 50;

	public static void main(String[] args) {
		System.out.println("main starts");
		int a=55;
		System.out.println(a);//consider local variable
		System.out.println(LocalAndGlobalvariableCalling.a);
		System.out.println("main ends");
	}

}
