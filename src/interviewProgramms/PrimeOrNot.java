package interviewProgramms;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number");
	
		int n=sc.nextInt();
		sc.close();
		int status=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				status=1;
				break;
			}
		}
		
		if(status==0)
		{
			System.out.println(n + " is a prime number");
		}
		else
		{
			System.out.println(n + " is not a prime number");
		}
		
		}



}
