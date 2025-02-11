// Jacobs version 10:02 11-02-2025
package exercise2;
import java.util.Random;
import java.util.Scanner;

public class Driver {
	
    public static final int SIZE = 100;
    public static final int UPPER_BOUND = 10;
    public static void main(String[] args) {

        Integer[] nums = new Integer[SIZE];
        Random rand = new Random();
        int randnum = rand.nextInt(UPPER_BOUND);
        nums[0] = randnum;
        System.out.println(nums[0]);

        for (int i = 1; i < SIZE; i++) {
            randnum = rand.nextInt(UPPER_BOUND);
            nums[i] = nums[i - 1] + randnum;
            System.out.println(nums[i]);
        }


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer to search: ");
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