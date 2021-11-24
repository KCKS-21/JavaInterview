package stringMethodsAndClasses;

public class StartEndContainsMethod {

	public static void main(String[] args) {
		String s1="java and html";
		boolean b1=s1.startsWith("sql");
		boolean b2 =s1.endsWith("ml");
		boolean b3=s1.contentEquals("AND");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
