package collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PalindromeFilter {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("madam");
        list.add("java");
        list.add("level");
        list.add("wipro");
        list.add("radar");
        list.add("hello");
        list.add("malayalam");
        list.add("abc");
        list.add("mom");
        list.add("code");

        Predicate<String> p = s ->
                s.equals(new StringBuilder(s).reverse().toString());

        System.out.println("Palindrome Words:");

        list.stream()
            .filter(p)
            .forEach(System.out::println);
    }
}