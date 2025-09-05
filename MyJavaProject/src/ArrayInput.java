import java.util.Scanner;

class ArrayInput{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int A[] = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("A["+i+"]: ");
            A[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++)
        {
            System.out.print(A[i]+" ");
        }
    }
}