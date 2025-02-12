/**
 * Lab 2: Comparing Objects, Searching and Sorting
 * Exercise 1: Student Comparison
 * 
 * This class implements the Comparator interface to compare students
 * based on age with name as secondary sort criteria.
 */
package exercise1;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        if (s1.getAge() != s2.getAge()) {
            return Integer.compare(s1.getAge(), s2.getAge()); // Sort by age first
        }
        return s1.getName().compareTo(s2.getName()); // If same age, sort by name
    }
}
