package interviewProgramms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		// fibonacci starts with 0&1,addition of two previous numbers

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc1.nextInt();

		int x = 0;
		int y = 1;
		System.out.print((x + " " + y));

		for (int i = 1; i <= n - 2; i++) {

			int z = x + y;
			System.out.print(" " + z);
			x = y;
			y = z;
		}

	}

}
