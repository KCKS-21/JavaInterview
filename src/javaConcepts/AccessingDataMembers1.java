package javaConcepts;

public class AccessingDataMembers1 {
	
	static int j=70;

	public static void main(String[] args) {
		
		test();
		AccessingDataMembers1 ad1=new AccessingDataMembers1();
		ad1.test1();
		
	}

	public static void test()
	{
		System.out.println(j);
		System.out.println(AccessingDataMembers1.j);
	}
	public void test1()
	{
		System.out.println(j);
	}
	
}
