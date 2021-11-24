package javaConcepts;

public class AccessingDataMembers2 {
	
	int x=50;
	static int y=60;
	

	public static void main(String[] args) {
		
		System.out.println("main starts");
		AccessingDataMembers2 ad1=new AccessingDataMembers2();
		AccessingDataMembers2 ad2=new AccessingDataMembers2();
		System.out.println(ad1.x);
		System.out.println("=============");
		System.out.println(ad2.x);
		System.out.println("=============");
		System.out.println(ad1.y);
		System.out.println("==============");
		System.out.println(ad2.y);
		
		ad2.x=99;
		ad1.y=33;//reintalising static value as we have only one copy
		System.out.println(ad1.y);
		ad2.y=87;
		System.out.println(ad1.x);
		System.out.println("***************");
		System.out.println(ad2.x);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println(ad1.y);
		System.out.println("&&&&&&&&&&&&&&&&&&");
		System.out.println(ad2.y);
		
		System.out.println("main starts");
		System.out.println(y);
		System.out.println(ad1.x);


	}

}
