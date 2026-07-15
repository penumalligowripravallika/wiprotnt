package Overriding;

public class Fruit {
	 String name;
	    String taste;
	    String size;

	    Fruit(String name, String taste, String size) {
	        this.name = name;
	        this.taste = taste;
	        this.size = size;
	    }

	    void eat() {
	        System.out.println("Fruit Name : " + name);
	        System.out.println("Taste : " + taste);
	    }

}
