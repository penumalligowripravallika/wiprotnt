package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SerializeDemo {

    public static void main(String[] args) throws Exception {

        Employee emp = new Employee(
                "Pravallika",
                new Date(),
                "IT",
                "Developer",
                50000);

        ObjectOutputStream out =
                new ObjectOutputStream(new FileOutputStream("data"));

        out.writeObject(emp);
        out.close();

        System.out.println("Object Serialized Successfully");
    }
}
