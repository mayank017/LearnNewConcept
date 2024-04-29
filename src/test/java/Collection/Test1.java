package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;


public class Test1 {
    public static void main(String[] args) {

        HashSet<Integer> hs1 = new HashSet<>(100, 0.90F);
        HashSet<Integer> hs2 = new HashSet<>(100);
        HashSet<Integer> hs3 = new HashSet<>((int) 0.90F);

        hs1.add(null);
        hs1.add(null);
        System.out.println(hs1);

        Integer i = new Integer(10);
        int b= i;
        System.out.println(b);

        Integer a = 20;
        Integer c = Integer.valueOf(a);
        System.out.println(a+ " --- " + c);

        int a1 = 10;
        String s1 = Integer.toString(a1);
    }
}
