package MultiLevelInheritance;

public class InitialisingClass {

	public static void main(String[] args) {

		Child c = new Child(1.1, 5, '$');
		Parent p = new Parent(2.2, 10);
		GrandParent gp = new GrandParent(3.3);

		System.out.println(c.ch);
		System.out.println(c.k);
		System.out.println(c.x);

		System.out.println("====================================");

		System.out.println(p.k);
		System.out.println(p.x);

		System.out.println("====================================");

		System.out.println(gp.k);
	}

}