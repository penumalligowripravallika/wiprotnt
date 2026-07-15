package ExceptionHandling1;

import java.util.Scanner;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.println("Enter Student Name");
                String name = sc.nextLine();

                int total = 0;

                for (int j = 1; j <= 3; j++) {

                    System.out.println("Enter Marks");

                    int mark = Integer.parseInt(sc.nextLine());

                    if (mark < 0)
                        throw new NegativeMarksException("Negative Marks Exception");

                    if (mark > 100)
                        throw new OutOfRangeException("Out Of Range Exception");

                    total += mark;

                }

                System.out.println("Average = " + (total / 3.0));

            }

        }

        catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }

        catch (NegativeMarksException e) {
            System.out.println(e.getMessage());
        }

        catch (OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();

    }

}