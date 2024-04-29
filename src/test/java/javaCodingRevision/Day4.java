package javaCodingRevision;

import java.util.HashMap;
import java.util.Map;

public class Day4 {
    public static void main(String[] args) {
        String s1 = "Mayank is my name";
        String[] s2 = s1.split(" ");

        Map<Character, Integer> myMap = new HashMap<>();
        for (int i = 0; i < s2.length; i++) {
            char[] mycharArray = s2[i].toCharArray();
            for (int j = 0; j < mycharArray.length; j++) {
                if (myMap.containsKey(mycharArray[j])) {
                    myMap.put((mycharArray[j]), myMap.get(mycharArray[j]) + 1);
                } else {
                    myMap.put(mycharArray[j], 1);
                }
            }
        }
        System.out.println(myMap);

        for (Map.Entry<Character, Integer> nMap : myMap.entrySet()) {
            if (nMap.getValue() > 1) {
                System.out.println(nMap.getKey() + " = " +  nMap.getValue());
            }
        }
    }
}
