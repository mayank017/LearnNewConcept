package JavaRevisionTopics.Serializable;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class DoSerialiazation {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Mayank");

        try {
            FileOutputStream file = new FileOutputStream("src/test/java/JavaRevisionTopics/Serializable/serialized.txt");
            ObjectOutputStream oos = new ObjectOutputStream(file);
            oos.writeObject(s1);
            System.out.println("Serilization done");
            oos.flush();
            oos.close();
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
