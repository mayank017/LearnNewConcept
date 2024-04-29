package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream4 {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("mayank", "test", "testalpha", "testbeta", "testgamma");
        List<String> myListInUpperCase = myList.stream().map(x -> x.toUpperCase()).collect(Collectors.toList());
        System.out.println(myListInUpperCase);
    }
}
