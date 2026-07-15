package collections;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeLocation {

    public static void main(String[] args) {

        ArrayList<Employee2> list = new ArrayList<>();

        list.add(new Employee2(101,"Pravallika","Hyderabad",30000));
        list.add(new Employee2(102,"Ravi","Pune",25000));
        list.add(new Employee2(103,"Anitha","Chennai",28000));
        list.add(new Employee2(104,"Divya","Bangalore",35000));
        list.add(new Employee2(105,"Kiran","Delhi",27000));

        Function<Employee2,String> f = e -> e.location;

        System.out.println("Employee Locations:");

        list.forEach(e -> System.out.println(f.apply(e)));
    }
}