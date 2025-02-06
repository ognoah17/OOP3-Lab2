package exercise1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        List<Student> studs = new ArrayList<>();
        studs.add(new Student("Smith", 34));
        studs.add(new Student("Johnson", 21));
        studs.add(new Student("Williams", 67));
        studs.add(new Student("Brown", 53));
        studs.add(new Student("Jones", 48));
        studs.add(new Student("Miller", 36));
        studs.add(new Student("Davis", 44));
        studs.add(new Student("Wilson", 52));
        studs.add(new Student("Anderson", 34));
        studs.add(new Student("Moore", 33));

        System.out.println("Original List:");
        System.out.println(studs);

        // Sorting by name using Comparable
        Collections.sort(studs);
        System.out.println("\nSorted by Name:");
        System.out.println(studs);

        // Sorting by age using Comparator
        Collections.sort(studs, new StudentAgeComparator());
        System.out.println("\nSorted by Age:");
        System.out.println(studs);
    }
}
