package encapsulation;

public class Calender {
	private static final Exception InvalidMonthNumber = null;
	private int monthNumber;//we made this as private so that user can only access should not able to modify
	
	public int get()
	{
		return monthNumber;
	}
	public void set(int monthNumber) throws Exception
	{
		if(monthNumber>=1&& monthNumber<=12)
		{
			this.monthNumber= monthNumber;
			System.out.println("Entered Number is a valid monthNumber");
		}
		else
		{
			throw InvalidMonthNumber;
		}
		
	}

}
