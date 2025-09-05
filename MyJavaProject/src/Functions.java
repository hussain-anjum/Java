import java.util.Scanner;

public class Functions {
    /*
    public static void java_repeat(){       //No parameter, no return value(karon 'void' ase)
        System.out.println("JAVA");
    }
    public static void main(String[] args) {
        java_repeat();
        java_repeat();
        java_repeat();
    }
     */
    public static int addition(int a, int b){       //Has Parameters, Has return value
        return a+b;     //main function ke return korbe.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        int ans = addition(a,b); //ei main function ke ja return korse,seita to kothao rakhte hobe. seita ans er modde rakhsi.

        System.out.println("Sum = "+ans);
    }

    /*
    public static void print_name(String name){     // Has Parameter, no return value(karon void ase)
        System.out.println(name);
    }
    public static void main(String[] args) {
        print_name("Ratul");
        print_name("Anjum");
    }
     */
    /*
    public static void addition(int a, int b){      // Has Parameter, no return value(karon void ase)
        int sum=a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a: ");
        int a = sc.nextInt();
        System.out.println("b: ");
        int b = sc.nextInt();

        addition(a,b);
    }
    */
}
