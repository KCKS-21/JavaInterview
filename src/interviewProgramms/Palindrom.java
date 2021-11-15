package interviewProgramms;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sp = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sp.nextInt();

		int temp = n;
		int r = 0;

		while (n > 0) {
			r = (r * 10) + (n % 10);
			n = n / 10;
		}
		if (temp == r) {
			System.out.println("number is palindrom");
		} else {
			System.out.println("number is not palindrom");
		}

	}
}
