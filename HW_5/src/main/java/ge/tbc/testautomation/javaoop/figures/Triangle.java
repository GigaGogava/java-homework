package ge.tbc.testautomation.javaoop.figures;

public class Triangle extends Figure{
    private double a = 10;
    private double b = 20;
    private double c = 15;
    private double h = 16;
    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }
    @Override
    public double getArea()
    {
        return a * b * h;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
