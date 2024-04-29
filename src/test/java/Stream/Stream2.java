package Stream;

import java.util.Arrays;
import java.util.List;

public class Stream2 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("Mayank", "Mayank2", "Mayank3", "Maya2", "MayankJaiswal1");
        // Print the name which has length more than 6 and less than 8
        myList.stream().filter(x -> x.length() >= 6).filter(x -> x.length() <= 8).forEach(System.out::println);
    }
}
