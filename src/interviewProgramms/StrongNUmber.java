package interviewProgramms;

import java.util.Scanner;

public class StrongNUmber {

	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);
		System.out.println("Enter Number");
		int n = ss.nextInt();
		int temp = n;
		int sum = 0;
		int reminder = 0;
		while (n > 0) {
			reminder = n % 10;
			int factorial = 1;

			for (int i = 1; i <= reminder; i++) {
				factorial = factorial * i;
			}

			sum = sum + factorial;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("number is strong number");
		} else {
			System.out.println("numbe is not a strong number");

		}

	}

}
