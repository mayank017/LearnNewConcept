package Stream;

import java.util.Arrays;
import java.util.List;

public class Stream3 {
    public static void main(String[] args) {
        List<String> mylist = Arrays.asList("Mayank", null, "A2", null, "Mayank3");
        mylist.stream().filter(n -> n != null).forEach(System.out::println);
    }
}
