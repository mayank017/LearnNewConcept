package javaCodingRevision;

public class Day8 {
    public static void main(String[] args) {
        String s1 = "My name is Mayank";
        int count = 0;

        try {
            while (true) {
                s1.charAt(count);
                count++;
            }
        } catch (Exception e) {

        }

        System.out.println(count);
    }
}
