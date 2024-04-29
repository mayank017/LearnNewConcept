package javaCodingRevision;

import java.util.Arrays;
import java.util.List;

public class Day1 {

    public static void main(String[] args) {
        String S1 = "My Name is Mayank";
        String[] s2 = S1.split(" ");
//        String newString = "";
//
//        for (int i = s2.length - 1; i >= 0; i--) {
//            newString = newString + s2[i] + " ";
//        }
//
//        System.out.println(newString);

        List<String> myList = Arrays.asList(s2);
        String newString = myList.stream().reduce("", (a, b) -> b + " " + a);
        newString = newString.trim();
        System.out.println(newString);

    }
}
