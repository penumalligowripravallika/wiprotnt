package collections;

import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();

        list.add(10);
        list.add(20.5);
        list.add(35.7f);
        list.add(100L);

        for(Number n : list) {
            System.out.println(n);
        }
    }
}