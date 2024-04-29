package Collection;

public class MyClass {
    public static void main(String[] args) {
        int result = 0;
        int a = 10;
        int b = 0;

        try {
            if (b == 0) {
                throw new MyOwnException();
            }
        } catch (MyOwnException e) {
            e.printStackTrace();
        }
    }
}
