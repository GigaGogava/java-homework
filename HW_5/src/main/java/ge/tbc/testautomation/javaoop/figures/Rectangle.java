package ge.tbc.testautomation.javaoop.figures;

public class Rectangle implements Comparable<Rectangle> {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int compareTo(Rectangle other) {
        return Double.compare(this.getArea(), other.getArea());
    }

    public double getArea() {
        return width * height;
    }
    @Override
    public String toString() {
    return "Rectangle : " + " width = " + width + " height " + height;
    }
}
