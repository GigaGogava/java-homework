package ge.tbc.testautomation.javaoop.figures;

import java.util.Comparator;

public class ReversedComparator implements Comparator<Rectangle> {

    @Override
    public int compare(Rectangle r1, Rectangle r2) {
        return r2.compareTo(r1);
    }

}
