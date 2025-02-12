# Lab 2: Comparing Objects, Searching, and Sorting

This project is part of Lab 2, which focuses on implementing and understanding various sorting and searching algorithms, as well as comparing objects using Java. The lab is divided into three exercises:

## Exercise 1: Student Comparison

In this exercise, we implement a `Student` class and compare students based on their names and ages.

### Files:
- **`src/exercise1/Student.java`**: Defines the `Student` class with attributes `name` and `age`. Implements `Comparable` to sort by name and overrides `equals` and `hashCode`.
- **`src/exercise1/StudentAgeComparator.java`**: Implements `Comparator` to sort students by age, with name as a secondary criterion.
- **`src/exercise1/Driver.java`**: Demonstrates sorting a list of students by name and age.

### Key Concepts:
- **Comparable Interface**: Used for natural ordering (by name).
- **Comparator Interface**: Used for custom ordering (by age).

## Exercise 2: Binary Search Implementation

This exercise involves implementing a binary search algorithm to find a target number in a sorted array.

### Files:
- **`src/exercise2/Driver.java`**: Contains the `binarySearch` method and demonstrates searching for a user-provided integer in a predefined sorted array.

### Key Concepts:
- **Binary Search**: Efficiently searches a sorted array with a time complexity of O(log n).

## Exercise 3: Sorting Implementation

In this exercise, we implement the QuickSort algorithm to sort an array in descending order.

### Files:
- **`src/exercise3/QuickSort.java`**: Implements the QuickSort algorithm.
- **`src/exercise3/Driver.java`**: Demonstrates sorting a randomly generated array using QuickSort and provides runtime analysis.

### Key Concepts:
- **QuickSort Algorithm**: A divide-and-conquer sorting algorithm with an average time complexity of O(n log n).

## Credits

- This project was collaboratively developed by team Ganon, with contributions split equally by all.

