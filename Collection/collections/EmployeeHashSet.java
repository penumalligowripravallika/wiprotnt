package collections;

import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Pravallika");
        employees.add("Mukundha");
        employees.add("Tahaseen");
        employees.add("Rishi");

        Iterator<String> it = employees.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}