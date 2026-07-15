package collections;

import java.util.*;

public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String,String> map=new TreeMap<>();

        map.put("India","Delhi");
        map.put("Japan","Tokyo");
        map.put("USA","Washington");

        System.out.println(map);
    }
}
