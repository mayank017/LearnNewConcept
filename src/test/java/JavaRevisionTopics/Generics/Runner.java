package JavaRevisionTopics.Generics;

public class Runner {
    public static void main(String[] args) {
        Box<Character> b = new Box('a');
        System.out.println(b.getContainer());
    }

}
