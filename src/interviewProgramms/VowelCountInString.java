package interviewProgramms;

import java.util.Scanner;

public class VowelCountInString {

	public static void main(String[] args) {
		
		Scanner sv=new Scanner(System.in);
		System.out.println("Eneter the string value");
		String s=sv.next();
		int count=0;
		
		for(int i=0;i<=s.length()-1;i++)
		{
			char ch=s.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
			{
				count++;
			}
		}
		System.out.println("Number of vowels: " + count);
		

	}

}
