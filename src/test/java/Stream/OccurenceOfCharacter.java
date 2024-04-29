package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacter {
    public static void main(String[] args) {
        String str = "Hi this is mayank";
        char[] myCharArray = str.toLowerCase().toCharArray();
        List<Character> myList = new ArrayList<>();

        for (char c : myCharArray) {
            myList.add(c);
        }

        Map<Character, Long> myMap = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        myMap.entrySet().stream().filter(x -> x.getValue() > 1).filter(x -> !x.getKey().equals(' ')).forEach(x -> System.out.println(x.getKey() + " = " + x.getValue()));
    }
}
