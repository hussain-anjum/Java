import java.util.Arrays;

public class SelectionSort {
    
    // Selection Sort method
    static void selectionSort(int arr[]) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if a smaller element is found
            if (minIndex != i) {
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Define an array of integers
        int[] arr = {5, 2, 7, 4, 9};

        // Call the selection sort function
        selectionSort(arr);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
