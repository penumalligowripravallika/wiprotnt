package classesandobjects;

public class Testcalculator {
    public static void main(String[] args) {

        Calculator c = new Calculator();

        System.out.println("2^3 = " + c.power(2, 3));

        System.out.println("2.5^2 = " + c.power(2.5, 2));
    }


}
