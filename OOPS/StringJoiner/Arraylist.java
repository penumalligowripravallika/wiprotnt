package Stringjoiner;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Arraylist {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of names: ");
	        int n = sc.nextInt();
	        sc.nextLine();

	        ArrayList<String> names = new ArrayList<>();

	        System.out.println("Enter the names:");

	        for (int i = 0; i < n; i++) {
	            names.add(sc.nextLine());
	        }

	        // StringJoiner with comma separator and {} brackets
	        StringJoiner sj = new StringJoiner(",", "{", "}");

	        for (String name : names) {
	            sj.add(name);
	        }

	        System.out.println("Output:");
	        System.out.println(sj);

	        sc.close();
	    }

}
