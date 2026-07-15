package collections;

import java.util.*;

public class HashTableDemo {

    public static void main(String[] args) {

        Hashtable<String,String> ht=new Hashtable<>();

        ht.put("India","Delhi");
        ht.put("Japan","Tokyo");
        ht.put("USA","Washington");

        System.out.println(ht);
    }
}