package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeFilter {

    public static void main(String[] args) {

        ArrayList<Employee1> list = new ArrayList<>();

        list.add(new Employee1(101,"Pravallika",20,"Pune"));
        list.add(new Employee1(102,"Ravi",22,"Hyderabad"));
        list.add(new Employee1(103,"Anitha",21,"Pune"));
        list.add(new Employee1(104,"Kiran",23,"Chennai"));
        list.add(new Employee1(105,"Divya",22,"Pune"));

        List<Employee1> result = list.stream()
                .filter(e -> e.location.equals("Pune"))
                .collect(Collectors.toList());

        System.out.println("Employees from Pune:");

        result.forEach(System.out::println);
    }
}
