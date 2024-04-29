package JavaRevisionTopics.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DoDeserilization {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("src/test/java/JavaRevisionTopics/Serializable/serialized.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Student s2 = (Student) ois.readObject();
            System.out.println("Deseilaization is done");
            ois.close();
            fis.close();
            System.out.println(s2.getId() + " " + s2.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
