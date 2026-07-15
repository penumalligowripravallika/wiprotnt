package collections;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ReverseWords {

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("Oracle");
        list.add("Spring");
        list.add("HTML");
        list.add("CSS");
        list.add("React");
        list.add("Angular");
        list.add("SQL");
        list.add("Cloud");

        Consumer<String> c = s ->
                System.out.println(new StringBuilder(s).reverse());

        System.out.println("Reversed Words:");

        list.forEach(c);
    }
}