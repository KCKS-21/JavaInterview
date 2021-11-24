package methodOverRiding;

public class InitialisingClass {

	public static void main(String[] args) {
		
		Sbi s=new Sbi();
		Union u=new Union();
		Canara c=new Canara();
		
		System.out.println("SBI rate of intrest   "+ s.getInterest());
		System.out.println("Union rate of intrest  "+ u.getInterest());
		System.out.println("Canara rate of intrest  "+ c.getInterest());

	}

}
