package Array;

import java.util.Arrays;

public class ReverseArrayFromNthPosition {
    public static void main(String[] args) {
        int n = 7;
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int length = arr1.length;
        int[] arr2 = new int[length];

        int a = 0;
        for (int i = n; i < length; i++) {
            arr2[a] = arr1[i];
            a++;
        }

        int b = length - n;
        for (int i = 0; i < n; i++) {
            arr2[b] = arr1[i];
            b++;
        }

        System.out.println(Arrays.toString(arr2));

    }
}
