package javaConcepts;

public class AccessingDataMembers {
	static int i = 50;
	int j = 60;

	public static void main(String[] args) {
		System.out.println("main starts");
		System.out.println(i);
		AccessingDataMembers ad = new AccessingDataMembers();
		System.out.println(ad.j);
		System.out.println("main ends");
	}

}
