package Overriding;

public class Apple extends Fruit  {
	Apple() {
        super("Apple", "Sweet", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Apple is Sweet.");
    }

}
