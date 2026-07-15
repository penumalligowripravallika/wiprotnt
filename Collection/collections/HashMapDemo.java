package collections;

import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String,String> map=new HashMap<>();

        map.put("101","Java");
        map.put("102","Python");
        map.put("103","C++");

        System.out.println(map.containsKey("101"));
        System.out.println(map.containsValue("Java"));

        Iterator<Map.Entry<String,String>> it=map.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
