package Stream;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfFistCharacter {
    public static void main(String[] args) {
        String s = "This is java";
        char[] chrary = s.toLowerCase().toCharArray();
        List<Character> charList = new ArrayList<>();

        for (char c : chrary) {
            if (c != ' ') {
                charList.add(c);
            }
        }

        Map<Character, Long> myMap = charList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Optional<Map.Entry<Character, Long>> a = myMap.entrySet().stream().filter(x -> x.getValue() > 1).findFirst();
        System.out.println(a.get());


    }
}
