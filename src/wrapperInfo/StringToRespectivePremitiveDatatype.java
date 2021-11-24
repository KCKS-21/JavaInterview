package wrapperInfo;

public class StringToRespectivePremitiveDatatype {

	public static void main(String[] args) {
		
		StringToRespectivePremitiveDatatype srp=new StringToRespectivePremitiveDatatype();
		srp.StringToInteger();
		System.out.println("");
		srp.StringToDouble();
		System.out.println("");
		srp.StringToCharacter();
		System.out.println("");
		srp.StringToBoolean();
		System.out.println("");
		srp.CharacterValidationMethods();
	}
	
	public void StringToInteger()
	{
		String s1="45";
		int i=Integer.parseInt(s1);
		System.out.println(i);
	}
	
	public void StringToDouble()
	{
		String s2="6.7";
		double j=Double.parseDouble(s2);
		System.out.println(j);
	}
	
	public void StringToCharacter()
	{
		String s3="I";
		char ch=s3.charAt(0);
		System.out.println(ch);
	}
	
	public void StringToBoolean()
	{
		String s4="true";
		boolean b1=Boolean.parseBoolean(s4);
		System.out.println(b1);
	}
	public void CharacterValidationMethods()
	{
		boolean b1=Character.isDigit(0);
		boolean b2=Character.isAlphabetic('h');
		boolean b3=Character.isUpperCase('y');
		boolean b4=Character.isLowerCase('%');
	}

}
