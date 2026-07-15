package operations1;

import java.util.ArrayList;
import java.util.Scanner;

public class StringMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String1");
        String s1 = sc.next();

        System.out.println("Enter String2");
        String s2 = sc.next();

        StringOperation obj = new StringOperation();

        ArrayList<String> result = obj.operate(s1, s2);

        System.out.println(result);

        sc.close();
    }
}