package Stream.IntermediateAndTerminalOperation;

import java.util.Arrays;
import java.util.List;


public class Operations {
    public static void main(String[] args) {
        List<Integer> data = Arrays.asList(5, 2, 3, 1, 4);
        boolean res =  data.stream().anyMatch(x -> x.toString().startsWith("1"));
        System.out.println(res);
    }
}
