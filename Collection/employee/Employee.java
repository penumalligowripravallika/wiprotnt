package employee;

public class Employee {

    String firstName;
    String lastName;
    long mobile;
    String email;
    String address;

    public Employee(String firstName, String lastName, long mobile,
            String email, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    @Override
    public String toString() {

        return String.format("%-15s %-15s %-15d %-30s %-15s",
                firstName,lastName,mobile,email,address);
    }

}