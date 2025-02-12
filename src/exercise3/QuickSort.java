package exercise3;

public class QuickSort {

    public static void sort(Integer[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            sort(arr, low, pivotIndex - 1); // Sort left partition
            sort(arr, pivotIndex + 1, high); // Sort right partition
        }
    }

    private static int partition(Integer[] arr, int low, int high) {
        int pivot = arr[high]; // Select last element as pivot
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] > pivot) { // Sorting in descending order
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    private static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
