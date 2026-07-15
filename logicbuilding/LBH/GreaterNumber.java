package LBH;

import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter First Number: ");
		int a = sc.nextInt();

		System.out.print("Enter Second Number: ");
		int b = sc.nextInt();

		if (a > b)
			System.out.println("Greater Number = " + a);
		else
			System.out.println("Greater Number = " + b);

		sc.close();
	}
}