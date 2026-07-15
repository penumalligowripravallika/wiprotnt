package employee;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class EmployeeMain {

	public static void main(String[] args) throws Exception {

		Scanner sc=new Scanner(System.in);

		int choice;

		do
		{
			System.out.println("\nMain Menu");
			System.out.println("1.Add Employee");
			System.out.println("2.Display All");
			System.out.println("3.Exit");

			System.out.print("Enter Choice : ");

			choice=sc.nextInt();

			switch(choice)
			{

			case 1:

				System.out.print("Enter Employee ID : ");
				int id=sc.nextInt();

				sc.nextLine();

				System.out.print("Enter Employee Name : ");
				String name=sc.nextLine();

				System.out.print("Enter Employee Age : ");
				int age=sc.nextInt();

				System.out.print("Enter Employee Salary : ");
				double salary=sc.nextDouble();

				Employee e=new Employee(id,name,age,salary);

				FileOutputStream fos=new FileOutputStream("employee.txt",true);

				ObjectOutputStream oos;

				if(new File("employee.txt").length()==0)
				{
					oos=new ObjectOutputStream(fos);
				}
				else
				{
					oos=new MyObjectOutputStream(fos);
				}

				oos.writeObject(e);

				oos.close();

				System.out.println("Employee Added Successfully");

				break;

			case 2:

				File file=new File("employee.txt");

				if(!file.exists())
				{
					System.out.println("No Records");
					break;
				}

				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));

				System.out.println("------Report------");

				try
				{
					while(true)
					{
						Employee emp=(Employee)ois.readObject();

						System.out.println(emp);
					}
				}
				catch(EOFException ex)
				{

				}

				ois.close();

				System.out.println("------End of Report------");

				break;

			case 3:

				System.out.println("Exiting the System");

				break;

			default:

				System.out.println("Invalid Choice");

			}

		}
		while(choice!=3);

		sc.close();

	}

}