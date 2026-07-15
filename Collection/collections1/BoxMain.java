package collections1;

import java.util.Scanner;

public class BoxMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BoxService service = new BoxService();

        System.out.println("Enter the number of Box");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("Enter the Box " + i + " details");

            System.out.println("Enter Length");
            double l = sc.nextDouble();

            System.out.println("Enter Width");
            double w = sc.nextDouble();

            System.out.println("Enter Height");
            double h = sc.nextDouble();

            Box b = new Box(l, w, h);

            service.addBox(b);

        }

        service.display();

        sc.close();

    }

}
