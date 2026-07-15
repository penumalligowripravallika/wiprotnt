package LBH;

import java.util.Scanner;

public class LastDigit {

    public static int getLastDigit(int n) {

        return Math.abs(n % 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("Last Digit = " + getLastDigit(n));

        sc.close();
    }
}