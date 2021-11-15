package interviewProgramms;

import java.util.Scanner;

public class ReverseOfNumber {
	public static void main(String[] args) {

		Scanner sr = new Scanner(System.in);

		System.out.println("Enter Number");

		int n = sr.nextInt();

		int r = 0;

		for (int i = 0; i <= n; i++) {
			r = (r * 10) + (n % 10);
			n = n / 10;
		}

		/*
		 * while (n>0 ||n!=0) { r = (r * 10) + (n % 10); n = n / 10; }
		 */

		System.out.println(r);

	}

}