import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x: ");
        double x = sc.nextDouble();

        System.out.println("Enter y: ");
        double y = sc.nextDouble();

        System.out.println("Enter z: ");
        double z = sc.nextDouble();

        sc.close();

        // Calculate semi-perimeter
        double s = (x + y + z) / 2;

        // Calculate area using Heron's formula
        double area = Math.sqrt(s * (s - x) * (s - y) * (s - z));

        System.out.println("Area: "+area);

    }
    
}
