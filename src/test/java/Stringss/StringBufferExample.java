package Stringss;

public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());

        StringBuffer sb1 = new StringBuffer(1000);
        System.out.println(sb.capacity());

        StringBuilder sb12 = new StringBuilder();
        System.out.println(sb12.capacity());
    }
}
