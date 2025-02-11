//Jacobs version 20:38 10-02-2025

package exercise2;

import java.util.Random;
import java.util.Scanner;

public class Driver
{

	public static final int SIZE = 100;
	public static final int UPPER_BOUND = 10;

	public static void main( String[] args )
	{

		Integer[] nums = new Integer[SIZE];
		Random rand = new Random();
		int randnum = rand.nextInt( UPPER_BOUND );
		nums[0] = randnum;

		for( int i = 1; i < SIZE; i++ )
		{
			randnum = rand.nextInt( UPPER_BOUND );
			nums[i] = nums[i - 1] + randnum;
			System.out.println( nums[i] );
		}
		  // Display the sorted list
        System.out.println("Sorted List:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println("\n");

        // Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search: ");
        int target = scanner.nextInt();

        // Perform binary search
        int index = binarySearch(nums, target);

        // Display search result
        if (index != -1) {
            System.out.println("Target " + target + " found at index " + index + ".");
        } else {
            System.out.println("Target " + target + " not found in the list.");
        }

        scanner.close();
    }

    /**
     * Binary Search Algorithm (Manually Implemented)
     * @param arr Sorted array of Integers
     * @param target Value to find
     * @return Index of target if found, otherwise -1
     */
    public static int binarySearch(Integer[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents integer overflow

            if (arr[mid].equals(target)) {
                return mid; // Target found
            } else if (arr[mid] < target) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Target not found
    }

}
