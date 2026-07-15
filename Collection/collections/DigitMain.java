package collections;

public class DigitMain {

    public static void main(String[] args) {

        DigitInterface obj = DigitCount::digitCount;

        System.out.println("Digits = " + obj.count(987654));
    }
}