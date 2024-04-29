package javaCodingRevision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Day2 {
    public static void main(String[] args) {
        String s1 = "My Name is Mayank";
        String[] strArg = s1.split(" ");
        String finalAns = "";
        for (int i = 0; i < strArg.length; i++) {
            String temp = "";
            for (int j = strArg[i].length() - 1; j >= 0; j--) {
                temp = temp + strArg[i].charAt(j);
            }
            finalAns = finalAns + temp + " ";

        }

        System.out.println(finalAns);

        StreamApi();
    }

    public static void StreamApi() {
        String s1 = "My Name is Mayank";
        String finalAns = Arrays.stream(s1.split(" "))
                .map(word -> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
        System.out.println(finalAns);
    }
}
