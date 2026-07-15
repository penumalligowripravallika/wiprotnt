package collections1;

public class Box {

    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return length * width * height;
    }

    @Override
    public boolean equals(Object obj) {

        Box b = (Box) obj;

        return this.getVolume() == b.getVolume();
    }

    @Override
    public int hashCode() {

        return (int) getVolume();
    }

}