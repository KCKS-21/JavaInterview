package typecasting;

public class TypeCasting {
	
	public static void main (String []args)
	{
		Superclass sc=new subClass();//implicit upcasting ;
		sc.walk();
		
		
		subClass sb=(subClass)sc;
		sb.run();
	}

}
