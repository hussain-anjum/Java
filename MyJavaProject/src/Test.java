import java.util.Arrays;

public class Test {
    public static void selectionSort(int arr[], int n){
        int min_index;
        for(int i = 0; i<n-1; i++){
            min_index = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if(min_index != i){
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
    }
    
    public static void main(String[] args) {
        int arr[] = {10, 50, 60, 8, 2};
        int n = arr.length;

        selectionSort(arr,n);

        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
