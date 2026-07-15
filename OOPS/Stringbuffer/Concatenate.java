package Stringbuffer;
import java.util.Scanner;

public class Concatenate {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First String: ");
        String s1 = sc.next();

        System.out.print("Enter Second String: ");
        String s2 = sc.next();

        String result;

        if (Character.toLowerCase(s1.charAt(s1.length() - 1))
                == Character.toLowerCase(s2.charAt(0))) {

            result = s1 + s2.substring(1);

        } else {

            result = s1 + s2;
        }

        System.out.println(result.toLowerCase());

        sc.close();
    }

}
