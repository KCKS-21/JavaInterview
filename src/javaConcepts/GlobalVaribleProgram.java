package javaConcepts;

public class GlobalVaribleProgram {
	
	static int k=50;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main starts");
		System.out.println(k);
		test1();
		System.out.println("main ends");
	}
	
	public static void test1()
	{
		System.out.println("test start");
		System.out.println(k);
		System.out.println("test ends");
	}

}
