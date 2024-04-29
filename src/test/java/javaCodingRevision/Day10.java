package javaCodingRevision;

import java.util.Arrays;

//sort array
public class Day10 {
    public static void main(String[] args) {
        int[] arr1 = {1, 23, 4, 5, 7, 23, 123, 5312};
        int[] sortedArray = Arrays.stream(arr1).boxed().sorted((a, b) -> b - a).mapToInt(Integer::intValue).toArray();
        System.out.println(Arrays.toString(sortedArray));
    }
}
