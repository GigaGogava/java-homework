package ge.tbc.testautomation.annotationsAndStreams;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("unused")
public class Analyzable {

    @VariableNameAnnotation(name = "IntGela")
    private int intGela;
    @VariableNameAnnotation()
    private int intGiga;
    @VariableNameAnnotation(name = "StringGela")
    private String stringGela;
    @VariableNameAnnotation(name = "StringGiga")
    private String stringGiga;
    @VariableNameAnnotation(name = "CharGiga")
    private char charGiga;
    @VariableNameAnnotation(name = "CharGel")
    private char charGel;
    @VariableNameAnnotation(name = "")
    private double doubleGelaGiga;
    @VariableNameAnnotation(name = "different1")
    private boolean booleanGela;
    @VariableNameAnnotation(name = "BooleanGiga")
    private boolean booleanGiga;
    @VariableNameAnnotation(name = "Different2")
    private byte gigaByte;
    @VariableNameAnnotation(name = "GelaByte")
    private byte gelaByte;
    @VariableNameAnnotation(name = "EmptyArrayGiga")
    private int[] emptyArrayGiga;
    @VariableNameAnnotation()
    private int[] reallyEmptyArray;


    public static void main(String[] args) {

        Analyzable analyzable = new Analyzable();
        List<Field> fields = Arrays.stream(analyzable.getClass().getDeclaredFields())
                .toList();

        List<Field> matching = fields.stream()
                .filter(field -> field.getAnnotation(VariableNameAnnotation.class) != null
                        && field.getName().equalsIgnoreCase(field.getAnnotation(VariableNameAnnotation.class).name()))
                .toList();

        List<Field> nonMatching = fields.stream()
                .filter(field -> field.getAnnotation(VariableNameAnnotation.class) != null
                        && !field.getName().equalsIgnoreCase(field.getAnnotation(VariableNameAnnotation.class).name()))
                .toList();

        System.out.println("Matching fields:");
        for (Field field : matching) {
            System.out.println(field.getName());
        }

        System.out.println("\nNon-matching:");
        for (Field field : nonMatching) {
            System.out.println(field.getName());
        }
        String unusedStringVar = "GG";
        int unusedIntVar = 10;
        boolean unusedBooleanVar = true;
        /*System.out.println("Fields with VariableNameAnnotation:");
        nonMatching.forEach(System.out::println);

        System.out.println("\nFields without VariableNameAnnotation:");
        matching.forEach(System.out::println);*/
    }
}

