package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.abstractClassesInterfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.IValidCircle;
import ge.tbc.testautomation.javaoop.figures.Circle;

public class Main {
    public static void main(String[] args) {

        Circle circle = new Circle(7.4);

        System.out.println("Area of circle: " + circle.getArea());
        System.out.println("Length of circle: " + circle.getLength());
        circle.printPackageName();

        IResizableCircle resizableCircle = circle;
        Circle doubledCircle = resizableCircle.returnDoubleSizedCircle(circle);
        Circle customSizedCircle = resizableCircle.returnCustomSizedCircle(circle, 1.5);

        System.out.println("Original radius: " + circle.getRadius());
        System.out.println("Doubled radius: " + doubledCircle.getRadius());
        System.out.println("Custom radius: " + customSizedCircle.getRadius());

        IValidCircle validator = circle;
        boolean isValid = validator.validateCircle(circle);

        System.out.println("Is circle valid? " + isValid);
    }
}






