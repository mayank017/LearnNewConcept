package AnoynmusInnerClass;

public class Runner {
    public static void main(String[] args) {
        MyOwnInterface myOI = new MyOwnInterface() {
            @Override
            public void doAddition(int a, int b) {
                System.out.println(a + b);
            }
        };
        myOI.doAddition(2,5);
    }
}
