package javaCodingRevision;

import java.util.Arrays;

//smallest number in array in java
public class Day9 {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 1, 5, 2, 7, 8};
        double min = Arrays.stream(arr1).average().getAsDouble();
        System.out.println(min);
    }
}
