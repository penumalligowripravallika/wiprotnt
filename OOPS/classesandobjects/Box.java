package classesandobjects;

public class Box {
	    int width;
	    int height;
	    int depth;

	    // Parameterized Constructor
	    Box(int width, int height, int depth) {
	        this.width = width;
	        this.height = height;
	        this.depth = depth;
	    }

	    void display() {
	        System.out.println("Width  : " + width);
	        System.out.println("Height : " + height);
	        System.out.println("Depth  : " + depth);
	    }
	}


