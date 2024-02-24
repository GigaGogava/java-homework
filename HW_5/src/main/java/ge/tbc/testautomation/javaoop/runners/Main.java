package ge.tbc.testautomation.javaoop.runners;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        try {
            Circle circle1 = new Circle(-5.0);
        } catch (RadiusException e) {
            System.out.println("RadiusException: " + e.getMessage());
        }

        try {
            for (int i = 0; i < 6; i++) {
                new Circle(5.0);
            }
        } catch (LimitException e) {
            System.out.println("LimitException: " + e.getMessage());
        }

        try {
            Circle circle2 = new Circle(3.0);
        } catch (Exception e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }

        String text = "Test Automation Bootcamp 6, 2022";
        System.out.println(text.toLowerCase().split(" ")[1]);

        String[] words = text.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("Length of the text is : " + text.length());
        System.out.println(text.replaceAll(" ", "-"));


        String[] phoneNumbers = {"599-144-155-166", "123-456-7890", "555123456", "592-987-654-321", "444111222"};
        for (String phoneNumber : phoneNumbers) {
            phoneNumber = phoneNumber.replaceAll("-", "");
            boolean isValid = phoneNumberValidation(phoneNumber);
            System.out.println(phoneNumber + " is valid: " + isValid);
            }
    }
    private static boolean phoneNumberValidation(String phoneNumber) {
        String regex = "^(555|595|592|599)\\d{6}$";
        return Pattern.matches(regex, phoneNumber);
    }

}

