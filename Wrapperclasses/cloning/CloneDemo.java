package cloning;

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee e1 = new Employee(101, "Pravallika", 35000);

        Employee e2 = (Employee) e1.clone();

        e1.salary = 50000;

        System.out.println("Original Employee");
        e1.display();

        System.out.println("Cloned Employee");
        e2.display();
    }
}