package JavaRevisionTopics.Clonable;

public class Runner {
    public static void main(String[] args) {
        Student s1 = new Student(123, "Test");

        try {
            Student s2 = (Student) s1.clone();
            s2.setId(4);
            System.out.println(s2.getName() + " " + s2.getId());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
