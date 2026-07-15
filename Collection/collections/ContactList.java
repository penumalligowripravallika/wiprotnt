package collections;

import java.util.*;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String,Integer> contact=new HashMap<>();

        contact.put("Pravallika",987654321);
        contact.put("Mukundha",987654322);
        contact.put("Tahaseen",987654323);

        System.out.println(contact.containsKey("Pravallika"));
        System.out.println(contact.containsValue(987654321));

        Iterator<Map.Entry<String,Integer>> it=contact.entrySet().iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}