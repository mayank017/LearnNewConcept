package javaCodingRevision;

import java.util.Arrays;
import java.util.List;


public class MethodRefrence {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("A", "B", "C", "D", "E");
        myList.forEach(MethodRefrence::printMyData);

    }

    public static void printMyData(Object O) {
        System.out.println(O);
    }
}
