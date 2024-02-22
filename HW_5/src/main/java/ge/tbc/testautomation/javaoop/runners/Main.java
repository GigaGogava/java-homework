package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;

public class Main {
    public static void main(String[] args) {

            Rectangle rectangle = new Rectangle(19, 10);
            Figure triangle = new Triangle(3, 4, 5, 6);

            System.out.println("Rectangle Area: " + rectangle.getArea());
            System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
            System.out.println("Triangle Area: " + triangle.getArea());
            System.out.println("Triangle Perimeter: " + triangle.getPerimeter());

            HelperFunctions.compareRectangles(rectangle, rectangle);
            HelperFunctions.staticMethod();

    }
}
