package Overriding;

public class Orange extends Fruit {
	Orange() {
        super("Orange", "Sour", "Medium");
    }

    @Override
    void eat() {
        System.out.println("Orange is Sour.");
    }

}
