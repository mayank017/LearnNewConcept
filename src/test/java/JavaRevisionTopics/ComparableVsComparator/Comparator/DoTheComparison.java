package JavaRevisionTopics.ComparableVsComparator.Comparator;

import java.util.Comparator;

public class DoTheComparison implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.getSalary() - o1.getSalary();
    }
}

