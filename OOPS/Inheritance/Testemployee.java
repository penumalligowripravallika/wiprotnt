package Inheritance;

public class Testemployee {
	

public static void main(String[] args) {

    Employee emp = new Employee(
            "Gowri",
            650000,
            2026,
            "NI123456");

    System.out.println("Employee Details");
    System.out.println("Name : " + emp.getName());
    System.out.println("Annual Salary : " + emp.getAnnualSalary());
    System.out.println("Year Started : " + emp.getYearStarted());
    System.out.println("National Insurance Number : "
            + emp.getNationalInsuranceNumber());
}
}