package singleLevelInheritanceWithConstructorChaning;

public class InitialisingClass {

	public static void main(String[] args) {
		ParentClass pc=new ParentClass(10);
		System.out.println(pc.i);
		System.out.println("======================================");
		 B chidclass=new B(20,30);
		 System.out.println(chidclass.i);
		 System.out.println(chidclass.j);
	 
	}

}
