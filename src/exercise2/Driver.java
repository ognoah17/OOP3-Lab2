/**
 * Lab 2: Comparing Objects, Searching and Sorting
 * Exercise 2: Binary Search Implementation
 */
package exercise2;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Driver {
    // ===== Constants =====
    public static final int SIZE = 100;
    public static final int UPPER_BOUND = 10;

    // ===== Main Method =====
    public static void main(String[] args) {
        // Use the provided list of integers as mentioned in rubric
        Integer[] nums = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25,
                27, 29, 31, 33, 35, 37, 39, 41, 43, 45, 47, 49 };

        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(nums));

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an integer to search for: ");
        int targetNum = scanner.nextInt();
        int index = binarySearch(nums, targetNum);

        if (index == -1) {
            System.out.println("Target " + targetNum + " was not found (-1)");
        } else {
            System.out.println("Target " + targetNum + " was found at index " + index);
        }
        scanner.close();
    }

    // ===== Binary Search Implementation =====
    public static int binarySearch(Integer[] sortedArray, int targetNum) {
        int startIndex = 0;
        int endIndex = sortedArray.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;

            if (sortedArray[middleIndex].equals(targetNum)) {
                return middleIndex;
            } else if (sortedArray[middleIndex] < targetNum) {
                startIndex = middleIndex + 1;
            } else {
                endIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}