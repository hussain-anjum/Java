import java.util.Arrays;

public class BubbleSort {
    
    // Bubble Sort method
    static void bubbleSort(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                
                // Swap if the element is greater than the next one
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Define an array of integers
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        int n = arr.length;

        // Call the bubble sort function
        bubbleSort(arr,n);

        // Output the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}
