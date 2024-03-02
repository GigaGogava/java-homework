package ge.tbc.testautomation.javaoop.figures;

public class Rectangle extends Figure implements Comparable<Rectangle> {
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
    public double getLength() {
        return 0;
    }

    @Override
    public void printPackageName() {

    }

    @Override
    public String toString() {
    return "Rectangle : " + " width = " + width + " height " + height;
    }
}
