package javaConcepts;

public class MethodOverLoading {

	public static void main(String[] args) {
		test(7,8);
		test(8,9.5);
		test(7.8,9);
		test(7,5,9);
		

	}
	public static void test(int i,int j)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("inside test of int,int arguments");
		
	}
	public static void test(int i,double j)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("inside test of int,double arguments");
	}
	public static void test(double i,int j)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(i+j);
		System.out.println("inside test of double,int arguments");
	}
	public static void test(int i,int j,int k)
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(i+j+k);
		System.out.println("inside test of double,int arguments");
	}
}
