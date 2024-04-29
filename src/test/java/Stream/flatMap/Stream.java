package Stream.flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {
        List<Integer> myll1 = Arrays.asList(1, 2);
        List<Integer> myll2 = Arrays.asList(3, 4);
        List<Integer> myll3 = Arrays.asList(5, 6);

        List<List<Integer>> myList = Arrays.asList(myll1, myll2, myll3);

        List<Integer> finalResult1 = myList.stream()
                .flatMap(x -> x.stream())
                .collect(Collectors.toList());
        System.out.println(finalResult1);


        List<Integer> finalResult2 = myList.stream()
                .flatMap(x -> x.stream().map(y -> y * 2))
                .collect(Collectors.toList());
        System.out.println(finalResult2);
    }
}
