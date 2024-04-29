package Stream.flatMap.flatmapAsObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapWithObject {
    public static void main(String[] args) {

        List<Student> StudentList1 = new ArrayList<>();
        StudentList1.add(new Student(1, "Mayank", 'A'));
        StudentList1.add(new Student(2, "Abhishek", 'B'));
        StudentList1.add(new Student(3, "Manu", 'C'));

        List<Student> StudentList2 = new ArrayList<>();
        StudentList2.add(new Student(4, "Rajjwa", 'C'));
        StudentList2.add(new Student(5, "Rahul", 'A'));
        StudentList2.add(new Student(6, "Rohit", 'B'));

        List<List<Student>> collabratedList = Arrays.asList(StudentList1, StudentList2);

        List<Student> fianlResult = collabratedList.stream()
                .flatMap(x -> x.stream())
                .filter(y -> y.getGrade() == 'B')
                .collect(Collectors.toList());

        for (Student s : fianlResult) {
            System.out.println(s.getId() + " " + s.getName() + " " + s.getGrade());
        }
    }
}
