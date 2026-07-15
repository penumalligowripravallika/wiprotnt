package collections;

import java.util.ArrayList;

public class OddLengthLambda {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Java");
        a1.add("Python");
        a1.add("Code");
        a1.add("Spring");
        a1.add("Oracle");
        a1.add("Wipro");
        a1.add("SQL");
        a1.add("HTML");
        a1.add("CSS");
        a1.add("Practice");

        System.out.println("Odd Length Strings:");

        a1.stream()
          .filter(s -> s.length() % 2 != 0)
          .forEach(System.out::println);
    }
}