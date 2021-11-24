package javaConcepts;

public class LocalVariableProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		int k=50;
		System.out.println(k);
		test();
		System.out.println("main ends");
	}
	
	public static void test()
	{
		System.out.println("test starts");
		int j=77;
		System.out.println(j);
		System.out.println("test ends");
	}

}
