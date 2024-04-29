package javaCodingRevision;

import java.util.HashMap;
import java.util.Map;

public class Day3 {
    public static void main(String[] args) {

        String s1 = "My name is Mayank jasiwal, i work is work with new with name";
        String[] strArr = s1.split(" ");

        Map<String, Integer> myMap = new HashMap<>();
        for (int i = 0; i < strArr.length; i++) {
            if (myMap.containsKey(strArr[i].toString())) {
                myMap.put(strArr[i].toString(), myMap.get(strArr[i]) + 1);
            } else {
                myMap.put(strArr[i].toString(), 1);
            }
        }

        System.out.println(myMap);

        for (Map.Entry<String, Integer> newMA : myMap.entrySet()) {
            if (newMA.getValue() > 1) {
                System.out.println(newMA.getKey());
            }
        }
    }
}
