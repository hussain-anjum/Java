import java.util.*;
public class MultiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row: ");
        int r = sc.nextInt();

        System.out.println("Enter coloumn: ");
        int c = sc.nextInt();

        int arr[][] = new int[r][c];
        int k = 2;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr[i][j] = k;
                k=k+2;
            }
        }
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
    
}
