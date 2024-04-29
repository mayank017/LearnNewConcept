package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream5 {
    public static void main(String[] args) {

        List<String> myList = Arrays.asList("mayank", "test", "testalpha", "testbeta", "testgamma");

        List<Integer> myListLength = myList.stream().map(x -> x.length()).collect(Collectors.toList());

        System.out.println(myListLength);
    }
}
