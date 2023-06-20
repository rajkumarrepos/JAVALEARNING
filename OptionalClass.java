import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Stream;


public class OptionalClass {
    public static void main(String[] args) {
        String email="rajkumar";
        Optional<Object> empty = Optional.empty();
        System.out.println(empty);
        //Optional<String> email1 = Optional.of(email);
        //System.out.println(email1);

        List<Integer> num = Arrays.asList(1,2,5,4,3,6,7);

          num.stream()
                  .filter(n -> n%2==1)
                  .sorted()
                  .map(n -> n*2)
                  .forEach(System.out:: println);




    }
}
