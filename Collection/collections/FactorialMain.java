package collections;

public class FactorialMain {

    public static void main(String[] args) {

        Factorial f = new Factorial();

        FactorialInterface obj = f::factorial;

        System.out.println("Factorial = " + obj.find(5));
    }
}