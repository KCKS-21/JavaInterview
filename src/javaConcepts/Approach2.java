package javaConcepts;

public class Approach2 {

	String gunName;
	int bullets;
	
	public void intialiseGun(String g , int b)
	{
		gunName=g;
		bullets=b;
	}
	
	public void fire()
	{
		for(int i=1;i<=bullets;i++)
		{
			System.out.println("fire bullets");
		}
	}

	public static void main(String[] args) {
		
		Approach2 a1=new Approach2();
		Approach2 a2=new Approach2();
		
		a1.intialiseGun("AK47", 15);
		//here we missed to call method of  second gun  still no error is displayed but this will effect user
		
		a1.fire();
		a2.fire();
				
}
}
