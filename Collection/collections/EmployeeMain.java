package collections;

public class EmployeeMain {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        Employee e1 = new Employee(101,
                "Pravallika",
                "pravallika@gmail.com",
                "Female",
                50000);

        Employee e2 = new Employee(102,
                "Mukundha",
                "mukundha@gmail.com",
                "Female",
                45000);

        db.addEmployee(e1);
        db.addEmployee(e2);

        System.out.println("Employee Details");

        db.showAllEmployees();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(102);

        System.out.println("After Deletion");

        db.showAllEmployees();
    }
}