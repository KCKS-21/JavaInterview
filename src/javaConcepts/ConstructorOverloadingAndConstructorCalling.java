package javaConcepts;

public class ConstructorOverloadingAndConstructorCalling {

		String gunName;
		int bullets;
		int version;

		ConstructorOverloadingAndConstructorCalling(int version)
		{
		this.version=version;
			
		}
		
		ConstructorOverloadingAndConstructorCalling(String gunName,int bullets,int version)
		{
		this(version);
		this.gunName=gunName;
		this.bullets=bullets;
			
		}

		public void fire() {
			GunInfo();
			for (int i = 1; i <= bullets; i++) {
				System.out.println("fire bullets "+ bullets);
			}
		}
		
		public void GunInfo() {
			System.out.println(gunName);
			System.out.println(bullets);
			System.out.println(version);
		}

		public static void main(String[] args) {

			ConstructorOverloadingAndConstructorCalling a1 = new ConstructorOverloadingAndConstructorCalling("pistol",5,1);
			ConstructorOverloadingAndConstructorCalling a2 = new ConstructorOverloadingAndConstructorCalling("Ak47",15,2);
			
			a1.fire();
			System.out.println("==============================================");
			a2.fire();

		}

	}


