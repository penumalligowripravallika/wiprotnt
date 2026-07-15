package serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializeDemo {

    public static void main(String[] args) throws Exception {

        ObjectInputStream in =
                new ObjectInputStream(new FileInputStream("data"));

        Employee emp = (Employee) in.readObject();

        in.close();

        System.out.println("Name : " + emp.getName());
        System.out.println("DOB : " + emp.getDateOfBirth());
        System.out.println("Department : " + emp.getDepartment());
        System.out.println("Designation : " + emp.getDesignation());
        System.out.println("Salary : " + emp.getSalary());
    }
}