package javaConcepts;

public class Approch1 {
	
	String gunName;
	int bullets;
	
	public void fire()
	{
		for(int i=1;i<=bullets;i++)
		{
			System.out.println("fire bullets");
		}
	}

	public static void main(String[] args) {
		
		Approch1 a1=new Approch1();
		Approch1 a2=new Approch1();
		
		a1.gunName="pistol";
		a1.bullets=5;
		
		a2.gunName="AK47";
		//here we missed to call variable/ mention second gun no.of bullets still no error is displayed but this will effect user
		
		a1.fire();
		a2.fire();
				
				
	
		
	}

}
