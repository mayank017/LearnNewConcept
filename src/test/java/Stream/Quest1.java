package Stream;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// print reapting string
public class Quest1 {
    public static void main(String[] args) {
        String str = "this is mayank hi this is mayank";
        List<String> myList = Arrays.asList(str.toLowerCase().split(" "));
        Map<String, Long> myMap = new HashMap<>();

        myMap = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        myMap.entrySet().stream().filter(x -> x.getValue() > 1).forEach(x -> System.out.println(x.getKey() + " = " + x.getValue()));

    }
}
