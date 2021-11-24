package javaConcepts;

public class MethodCalling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main starts");
		walk();
		System.out.println("main ends");
	}

	public static void walk()
	{
		System.out.println("walk starts");
		run();
		System.out.println("walk ends");
	}
	
	public static void run()
	{
		System.out.println("run starts");
		System.out.println("run ends");
	}
}
