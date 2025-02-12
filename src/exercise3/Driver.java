package exercise3;

import java.util.Random;
import java.util.Scanner;

public class Driver {
	// Constants
	private static final int SIZE = 1000;
	private static final int UPPER_BOUND = 100000000;
	private static final int RUNS = 5; // Number of sorting runs to average

	// Utility objects
	private static final Random rand = new Random();
	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		runSortingMenu();
		scanner.close();
	}

	private static void runSortingMenu() {
		while (true) {
			displayMenu();
			System.out.print("Enter your choice (b/i/s/q to sort, x to exit): ");
			char choice = scanner.next().charAt(0);

			if (choice == 'x') {
				System.out.println("Goodbye!");
				displayJavaInfo();
				break;
			}

			if (choice == 'b' || choice == 'i' || choice == 's' || choice == 'q') {
				processSort(choice);
			} else {
				System.out.println("Invalid choice. Please use b, i, s, q, or x to exit.");
			}
		}
	}

	private static void processSort(char sortChoice) {
		Integer[] nums = generateRandomArray();

		System.out.println("\nChosen Algorithm: " + getAlgorithmName(sortChoice));

		// Apply chosen sort (only QuickSort is implemented)
		long startTime = System.nanoTime();
		switch (sortChoice) {
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
	}

	private static void displayMenu() {
		System.out.println("\nAvailable Sorting Algorithms:");
		System.out.println("b. Bubble Sort");
		System.out.println("i. Insertion Sort");
		System.out.println("s. Selection Sort");
		System.out.println("q. QuickSort");
		System.out.println("x. Exit");
	}

	private static String getAlgorithmName(char choice) {
		switch (choice) {
			case 'b':
				return "Bubble Sort";
			case 'i':
				return "Insertion Sort";
			case 's':
				return "Selection Sort";
			case 'q':
				return "QuickSort";
			default:
				return "Unknown Algorithm";
		}
	}

	private static Integer[] generateRandomArray() {
		java.util.Set<Integer> uniqueNums = new java.util.HashSet<>();
		while (uniqueNums.size() < SIZE) {
			uniqueNums.add(rand.nextInt(UPPER_BOUND));
		}
		return uniqueNums.toArray(new Integer[0]);
	}

	private static void displayJavaInfo() {
		System.out.println("\nJava Environment Information:");
		System.out.println("JRE Version: " + System.getProperty("java.version"));
		System.out.println("JRE Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("OS Name: " + System.getProperty("os.name"));
		System.out.println("OS Architecture: " + System.getProperty("os.arch"));
	}
}
