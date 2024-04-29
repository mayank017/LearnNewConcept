package Stringss;

public class StringClass2 {
    public static void main(String[] args) {
        String s1 = new String("Mayank");
        String s2 = new String("Mayank");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        System.out.println("======");

        String s3 = "Mayank";
        String s4 = "Mayank";
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        System.out.println("======");

        String s5 = new String("Mayank");
        String s6 = "Mayank";
        System.out.println(s5 == s6);
        System.out.println(s5.equals(s6));

    }
}
