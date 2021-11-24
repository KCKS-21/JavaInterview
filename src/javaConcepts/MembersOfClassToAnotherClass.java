package javaConcepts;

public class MembersOfClassToAnotherClass {
public static void main(String[] args) {
		
		System.out.println("main starts");
		System.out.println(Test.i);
		Test t = new Test();
		System.out.println(t.j);
		System.out.println("main ends");
	}

	
}

class Test{
	
	static int i = 60;
	int j = 70;
}


