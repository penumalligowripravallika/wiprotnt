package Encapsulation;

public class Test {
	 public static void main(String[] args) {

	        Authorclass author = new Authorclass(
	                "James Gosling",
	                "james@gmail.com",
	                'M');

	        Bookclass book = new Bookclass(
	                "Java Programming",
	                author,
	                799.50,
	                25);

	        System.out.println("Book Name : " + book.getName());
	        System.out.println("Price : " + book.getPrice());
	        System.out.println("Quantity : " + book.getQtyInStock());

	        System.out.println("\nAuthor Details");
	        System.out.println("Name : " + book.getAuthor().getName());
	        System.out.println("Email : " + book.getAuthor().getEmail());
	        System.out.println("Gender : " + book.getAuthor().getGender());
	    }

}
