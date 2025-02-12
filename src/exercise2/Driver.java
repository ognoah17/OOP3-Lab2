// Jacobs version 10:02 11-02-2025
package exercise2;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Driver {

    public static final int SIZE = 100;
    public static final int UPPER_BOUND = 10;

    public static void main(String[] args) {
        Integer[] nums = new Integer[SIZE];
        Random rand = new Random();

        // Generate array of random numbers (simpler to test with)
        for (int i = 0; i < SIZE; i++) {
            nums[i] = rand.nextInt(UPPER_BOUND);
        }

        // Sort array for binary search
        Arrays.sort(nums);

        System.out.println("Generated sorted array:");
        for (int num : nums) {
            System.out.println(num);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter an integer to search (0-" + UPPER_BOUND + "): ");
        int targetNum = scanner.nextInt();
        int index = binarySearch(nums, targetNum);

        if (index == -1) {
            System.out.println("-1 Not Found");
        } else {
            System.out.println("Target " + targetNum + " found at index " + index + ".");
        }
        scanner.close();
    }

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