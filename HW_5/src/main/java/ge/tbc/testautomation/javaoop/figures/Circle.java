package ge.tbc.testautomation.javaoop.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.IValidCircle;

public class Circle extends Figure implements IResizableCircle, IValidCircle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println("Name of package is : " + this.getClass().getPackageName());
    }
    @Override
    public boolean validateCircle(Circle circle) {
        return circle.getRadius() > 0;
    }

    public double getRadius() {
        return radius;
    }
    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        return new Circle(circle.radius * 2);
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byValue) {
        return new Circle(circle.radius * byValue);
    }

}

