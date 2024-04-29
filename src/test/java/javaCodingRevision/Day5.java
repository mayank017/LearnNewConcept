package javaCodingRevision;

public class Day5 {
    public Day5(){
        System.out.println("hi");
    }

    public Day5(int a){
        this();
        System.out.println(a);
    }

    public Day5(int a, int b){
        this(a);
        System.out.println(a+b);
    }
}
