package collections;

import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeSalaryFilter {

    public static void main(String[] args) {

        ArrayList<Employee3> list = new ArrayList<>();

        list.add(new Employee3(101,"Pravallika",9000));
        list.add(new Employee3(102,"Ravi",12000));
        list.add(new Employee3(103,"Anitha",8000));
        list.add(new Employee3(104,"Divya",15000));
        list.add(new Employee3(105,"Kiran",7000));

        Predicate<Employee3> p = e -> e.getSalary() < 10000;

        System.out.println("Employees Salary < 10000:");

        list.stream()
            .filter(p)
            .forEach(e -> System.out.println(e.getName()));
    }
}