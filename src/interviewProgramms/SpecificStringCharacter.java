package interviewProgramms;

import java.util.Scanner;

public class SpecificStringCharacter {

	public static void main(String[]args)
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("enter the string value");	
		String s=ss.next();
		System.out.println("enter index number");
		int givenIndex=ss.nextInt();
		int startIndex=0;
		int endIndex=s.length()-1;
		if(givenIndex>=startIndex && givenIndex<=endIndex)
		{
			char c=s.charAt(givenIndex);
			System.out.println(c);
		}
		else
		{
			System.out.println("Invalid index");
		}
		
	}

}
