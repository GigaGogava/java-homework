package ge.tbc.testautomation.javaoop.figures;

public class Circle extends Figure implements Comparable<Circle> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public int compareTo(Circle other) {
        if (this.radius > other.radius) {
            return 1;
        } else if (this.radius < other.radius) {
            return -1;
        } else {
            return 0;
        }
    }


    @Override
    public double getArea() {
        return 0;
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
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}



