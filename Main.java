import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

        Level level = Level.MEDIUM;
        System.out.println(level.getAbbr());
        System.out.println(level.ordinal());
        switch (level) {
            case LOW:
                System.out.println("low is connected");
                break;
            case MEDIUM:
                System.out.println("medium is connected");
                break;
            case HIGH:
                System.out.println("high level is connected"
                );
        }

        for (Level lev : Level.values()) {

            System.out.println(lev);
        }
    }
}