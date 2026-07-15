package employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class EmployeeMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("Enter Number of Employees");

        int n = sc.nextInt();
        sc.nextLine();

        for(int i=1;i<=n;i++)
        {

            System.out.println("Enter Employee "+i+" Details");

            System.out.print("First Name : ");
            String fname=sc.nextLine();

            System.out.print("Last Name : ");
            String lname=sc.nextLine();

            System.out.print("Mobile : ");
            long mobile=sc.nextLong();
            sc.nextLine();

            System.out.print("Email : ");
            String email=sc.nextLine();

            System.out.print("Address : ");
            String address=sc.nextLine();

            list.add(new Employee(fname,lname,mobile,email,address));

        }

        Collections.sort(list,new Comparator<Employee>() {

            public int compare(Employee e1,Employee e2)
            {
                return e1.firstName.compareToIgnoreCase(e2.firstName);
            }

        });

        System.out.println();

        System.out.printf("%-15s %-15s %-15s %-30s %-15s\n",
                "FirstName","LastName","Mobile","Email","Address");

        for(Employee e:list)
        {
            System.out.println(e);
        }

        sc.close();
    }

}