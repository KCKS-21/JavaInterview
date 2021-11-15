package interviewProgramms;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num;
		System.out.println("Enter number");
		Scanner se=new Scanner(System.in);
		num=se.nextInt();
		
		if(num%2==0)
		{
			System.out.println("Enter number is even");
		}
		else
		{
			System.out.println("Enter number is odd");
		}
	}

}
