package interviewProgramms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		Scanner sa = new Scanner(System.in);
		System.out.println("enter number");

		int n = sa.nextInt();
		int temp = n;
		int reminder = 0;
		int reminderCubeResult = 0;
		int sum = 0;

		while (n > 0) {
			reminder = (n % 10);
			reminderCubeResult = reminder * reminder * reminder;
			sum = sum + reminderCubeResult;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Given Number is Armstrong number");
		} else {
			System.out.println("Not Armstrong number");
		}

	}

}
