package collections;

import java.util.ArrayList;

public class StudentFilter {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1,"Pravallika",90));
        list.add(new Student(2,"Ravi",40));
        list.add(new Student(3,"Anitha",70));
        list.add(new Student(4,"Kiran",35));
        list.add(new Student(5,"Divya",80));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed = " + count);
    }
}
