package javaConcepts;

public class CopyConstructor {

	String gunName;
	int bullets;
	int version;
	String model;

	CopyConstructor(CopyConstructor cc,String model) {
		this.version = cc.version;
		this.gunName = cc.gunName;
		this.bullets = cc.bullets;
		this.model= model;
		
	}

	CopyConstructor(String gunName, int bullets, int version) {
		this.version = version;
		this.gunName = gunName;
		this.bullets = bullets;

	}


	public void fire() {
		GunInfo();
		for (int i = 1; i <= bullets; i++) {
			System.out.println("fire bullets " + bullets);
		}
	}

	public void GunInfo() {
		System.out.println(gunName);
		System.out.println(bullets);
		System.out.println(version);
		System.out.println(model);
		
	}

	public static void main(String[] args) {

		CopyConstructor a1 = new CopyConstructor("pistol", 5,1);
		CopyConstructor a2 = new CopyConstructor("Ak47", 15, 2);
		CopyConstructor a3 = new CopyConstructor(a1,"model");

		a1.fire();
		System.out.println("==============================================");
		a2.fire();
		System.out.println("==============================================");
		a3.fire();

	}

}
