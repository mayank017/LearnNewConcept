package JavaRevisionTopics.ComparableVsComparator.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "mayank", 500000);
        Employee e2 = new Employee(1, "Avi", 300000);
        Employee e3 = new Employee(1, "Bhanu", 200000);

        List<Employee> ll = new ArrayList<>();
        ll.add(e1);
        ll.add(e2);
        ll.add(e3);

        Collections.sort(ll);

        for(Employee ec: ll) {
            System.out.println(ec.getId() + " " +ec.getName() + " " + ec.getSalary());
        }

    }
}
