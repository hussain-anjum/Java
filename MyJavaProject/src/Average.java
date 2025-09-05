import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter CSE mark: ");
        float CSE = sc.nextFloat();

        System.out.println("Enter EEE mark: ");
        float EEE = sc.nextFloat();

        float avg = (CSE+EEE)/2;

        System.out.println("Average: "+avg);

        sc.close();
    }
}