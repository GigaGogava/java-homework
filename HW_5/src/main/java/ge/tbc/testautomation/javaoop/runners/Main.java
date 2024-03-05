package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.generics.AnyPair;
import ge.tbc.testautomation.generics.FigurePair;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Rectangle;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

    @SuppressWarnings("removal")
    public static void main(String[] args) {

        AnyPair<Field[], Field[]> fieldsPair = getDeclaredFields(new Integer(10), "I dont know what im doing");
        System.out.println(Arrays.asList(fieldsPair.getElementOne()));
        System.out.println(Arrays.asList(fieldsPair.getElementTwo()));
        System.out.println(Arrays.asList(fieldsPair));

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);

        System.out.println(figurePair);
    }
}
