package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 = random.nextInt(50) + 1;
        int randomNumber2 = random.nextInt(50) + 1;
        int randomNumber3 = random.nextInt(50) + 1;
        int randomNumber4 = random.nextInt(50) + 1;
        int randomNumber5 = random.nextInt(50) + 1;

        Circle circle1 = new Circle(randomNumber1);
        Circle circle2 = new Circle(randomNumber2);
        Circle circle3 = new Circle(randomNumber3);
        Circle circle4 = new Circle(randomNumber4);
        Circle circle5 = new Circle(randomNumber5);

        System.out.println(Util.circleToString(circle1));
        System.out.println(Util.circleToString(circle2));
        System.out.println(Util.circleToString(circle3));
        System.out.println(Util.circleToString(circle4));
        System.out.println(Util.circleToString(circle5));


    }
}
