package collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PerfectSquare {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(7);
        list.add(9);
        list.add(15);
        list.add(16);
        list.add(20);
        list.add(25);

        Predicate<Integer> p = n -> {
            int r = (int)Math.sqrt(n);
            return r * r == n;
        };

        System.out.println("Perfect Square Numbers:");

        list.stream()
            .filter(p)
            .forEach(System.out::println);
    }
}
