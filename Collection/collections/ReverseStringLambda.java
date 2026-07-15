package collections;

import java.util.ArrayList;

public class ReverseStringLambda {

    public static void main(String[] args) {

        ArrayList<String> a1 = new ArrayList<>();

        a1.add("Java");
        a1.add("Python");
        a1.add("Oracle");
        a1.add("Spring");
        a1.add("Wipro");
        a1.add("Collections");
        a1.add("Lambda");
        a1.add("Programming");
        a1.add("Code");
        a1.add("Practice");

        System.out.println("Reverse Order:");

        a1.stream()
          .sorted((s1, s2) -> s2.compareTo(s1))
          .forEach(System.out::println);
    }
}