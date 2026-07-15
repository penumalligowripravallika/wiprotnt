package collections;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class EmployeeVector {

    public static void main(String[] args) {

        Vector<Employee> list = new Vector<>();

        list.add(new Employee(101,"Pravallika","p@gmail.com","Female",50000));
        list.add(new Employee(102,"Mukundha","m@gmail.com","Female",45000));

        System.out.println("Using Iterator");

        Iterator<Employee> it = list.iterator();

        while(it.hasNext()) {
            it.next().getEmployeeDetails();
            System.out.println();
        }

        System.out.println("Using Enumeration");

        Enumeration<Employee> en = list.elements();

        while(en.hasMoreElements()) {
            en.nextElement().getEmployeeDetails();
            System.out.println();
        }
    }
}