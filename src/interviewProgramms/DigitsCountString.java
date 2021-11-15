package interviewProgramms;

import java.util.Scanner;

public class DigitsCountString {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string vaue");
		String s1=sc.next();
		int digitCount=0;
		for(int i=0;i<=s1.length()-1;i++)
		{
			char ch=s1.charAt(i);
			if (Character.isDigit(ch)==true || Character.isDigit(ch))
					{
						digitCount++;
					}
		}
		System.out.println("no.of digits : "  + digitCount);
				

	}

}
