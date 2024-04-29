package Stream;

public class javaCallByValue {
    int i;
    public static void main(String[] args) {
        javaCallByValue jvc = new javaCallByValue();
        jvc.i = 2;
        changeValue(jvc);
        System.out.println(jvc.i);
    }

    public static void changeValue(javaCallByValue jvc1) {
        jvc1.i = 32;
    }
}
