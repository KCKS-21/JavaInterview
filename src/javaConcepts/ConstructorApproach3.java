package javaConcepts;

public class ConstructorApproach3 {

	String gunName;
	int bullets;

	ConstructorApproach3(String gunName,int bullets)
	{
	this.gunName=gunName;
	this.bullets=bullets;
		
	}

	public void fire() {
		GunInfo();
		for (int i = 1; i <= bullets; i++) {
			System.out.println("fire bullets");
		}
	}
	
	public void GunInfo() {
		System.out.println(gunName);
		System.out.println(bullets);
	}

	public static void main(String[] args) {

		ConstructorApproach3 a1 = new ConstructorApproach3("pistol",5);
		ConstructorApproach3 a2 = new ConstructorApproach3("Ak47",15);
		
		a1.fire();
		System.out.println("==============================================");
		a2.fire();

	}

}
