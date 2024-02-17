package org.example;

import static java.awt.AWTEventMulticaster.add;

public class Main {
    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static void main(String[] args) {
        int result1 = add(5, 3);
        int result2 = subtract(10, 7);

        int[] additionResults = new int[1];
        additionResults[0] = result1;
        int[] subtractionResults = new int[1];
        subtractionResults[0] = result2;

        System.out.println("For loop Addition Results:");
        for (int i = 0; i < additionResults.length; i++) {
            System.out.println(additionResults[i]);
        }

        System.out.println("For loop Subtraction Results:");
        for (int subtractionResult : subtractionResults) {
            System.out.println(subtractionResult);
        }

        System.out.println("while loop Addition/Subtraction Results + Even/Odd");
        /*int i = 0;
        while (i < 2) {
            if (i == 0) {
                System.out.print(result1 + " ");
            } else {
                System.out.print(result2);
            }
            i++;
        }*/

        int index = 0;
        while (index < additionResults.length) {
            int result = additionResults[index];
            System.out.print(result);
            if (result % 2 == 0){
                System.out.print(" even ");
            } else {
                System.out.print(" odd ");
            }
            index++;
        }
        index = 0;
        while (index < subtractionResults.length) {
            int result = subtractionResults[index];
            System.out.print(result);
            if (result % 2 == 0) {
                System.out.print(" even ");
            } else {
                System.out.print(" odd ");
            }
            index++;
        }

    }
}
