package interviewProgramms;

import java.util.Scanner;

public class StringCharacterCount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string value");
		
		String s = sc.next();
		
		System.out.println("enter Character");
		
		String s1 = sc.next();
		
		char givenCharacter = s1.charAt(0);
		
		int count = 0;
		
		for (int i = 0; i <= s.length() - 1; i++) 
		{
			char ch = s.charAt(i);
			
			if (ch == givenCharacter)
			{
				count++;
			}
		}
		System.out.println("Number of given character is :" + count);

	}
}
