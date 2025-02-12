/**
 * Lab 2: Comparing Objects, Searching and Sorting
 * Exercise 3: Sorting Implementation
 */
package exercise3;

import java.util.Random;

public class Driver {
	private static final int SIZE = 100;
	private static final int UPPER_BOUND = 1000;
	private static final Random rand = new Random();

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java Driver <b|i|s|q>");
			return;
		}

		char choice = args[0].charAt(0);
		Integer[] nums = generateRandomArray();

		// Display original array
		System.out.println("Original Array:");
		displayArray(nums);

		// Apply chosen sort
		switch (choice) {
			case 'b': // Bubble sort - not implemented
				System.out.println("\nBubble Sort Description:");
				System.out.println("- Repeatedly steps through the list");
				System.out.println("- Compares adjacent elements and swaps them if in wrong order");
				System.out.println("- Expected complexity: O(n²)");
				break;
			case 'i': // Insertion sort - not implemented
				System.out.println("\nInsertion Sort Description:");
				System.out.println("- Builds final array one item at a time");
				System.out.println("- Each iteration removes one element and finds its correct position");
				System.out.println("- Expected complexity: O(n²)");
				break;
			case 's': // Selection sort - not implemented
				System.out.println("\nSelection Sort Description:");
				System.out.println("- Divides input into sorted and unsorted regions");
				System.out.println("- Repeatedly selects smallest element from unsorted region");
				System.out.println("- Expected complexity: O(n²)");
				break;
			case 'q': // QuickSort
				System.out.println("\nQuickSort Description:");
				System.out.println("- Uses divide-and-conquer strategy");
				System.out.println("- Picks a 'pivot' element and partitions array around it");
				System.out.println("- Recursively sorts the sub-arrays");
				System.out.println("- Expected complexity: O(n log n)");

				long startTime = System.nanoTime();
				QuickSort.sort(nums, 0, SIZE - 1);
				long endTime = System.nanoTime();
				long timeTakenNano = endTime - startTime;

				// Display timing and analysis
				System.out.println("\nRuntime Analysis:");
				System.out.println("Array size (n): " + SIZE);
				System.out.println("Expected complexity: O(n log n)");
				double timeInMs = timeTakenNano / 1_000_000.0;
				System.out.printf("Actual time: %.2f ms (%d ns)%n", timeInMs, timeTakenNano);
				break;
		}

		System.out.println("\nSorted Array:");
		displayArray(nums);
	}

	// ===== Array Display Methods =====
	private static void displayArray(Integer[] arr) {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
			if (i < arr.length - 1) {
				sb.append(", ");
			}
		}
		sb.append("]");
		System.out.println(sb.toString());
	}

	private static Integer[] generateRandomArray() {
		java.util.Set<Integer> uniqueNums = new java.util.HashSet<>();
		while (uniqueNums.size() < SIZE) {
			uniqueNums.add(rand.nextInt(UPPER_BOUND));
		}
		return uniqueNums.toArray(new Integer[0]);
	}
}
