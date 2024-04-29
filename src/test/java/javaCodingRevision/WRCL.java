package javaCodingRevision;

public class WRCL {
    public static void main(String[] args) {
        int i = 10;
        String s = String.valueOf(i);
        System.out.println(s);
        System.out.println(s.getClass());

        String s1 = "123";
        int a = Integer.parseInt(s1);
        Object obj = a;
        if (obj instanceof Integer) {
            System.out.println("Integer");
        }

        System.out.println(a);
    }
}
