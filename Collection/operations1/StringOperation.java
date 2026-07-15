package operations1;

import java.util.ArrayList;

public class StringOperation {

    public ArrayList<String> operate(String s1, String s2) {

        ArrayList<String> list = new ArrayList<>();

        // Operation 1
        StringBuilder op1 = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0)
                op1.append(s2);
            else
                op1.append(s1.charAt(i));
        }
        list.add(op1.toString());

        // Operation 2
        int first = s1.indexOf(s2);
        int last = s1.lastIndexOf(s2);

        if (first != last) {
            String rev = new StringBuilder(s2).reverse().toString();
            String op2 = s1.substring(0, last) + rev
                    + s1.substring(last + s2.length());
            list.add(op2);
        } else {
            list.add(s1 + s2);
        }

        // Operation 3
        if (first != last) {
            String op3 = s1.replaceFirst(s2, "");
            list.add(op3);
        } else {
            list.add(s1);
        }

        // Operation 4
        int mid = (s2.length() + 1) / 2;

        String firstHalf = s2.substring(0, mid);
        String secondHalf = s2.substring(mid);

        list.add(firstHalf + s1 + secondHalf);

        // Operation 5
        String op5 = s1;

        for (int i = 0; i < s2.length(); i++) {
            op5 = op5.replace(s2.charAt(i), '*');
        }

        list.add(op5);

        return list;
    }
}
