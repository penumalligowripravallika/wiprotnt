package Optionalclass;
import java.util.Optional;

public class Assignment3 {
    public static void main(String[] args) {

        // Change this to a valid employee object to test
        Employee emp = null;

        try {
            Employee employee = Optional.ofNullable(emp)
                    .orElseThrow(() ->
                            new InvalidEmployeeException("Employee object is null"));

            employee.display();

        } catch (InvalidEmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }


}
