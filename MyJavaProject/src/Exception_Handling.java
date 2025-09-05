public class Exception_Handling {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{    
            j = 10/i;                                       // This line will throw an exception
        }
        catch(Exception e){                                 // Catch the exception
            System.out.println("Catch the exception");
        }
        System.out.println("Value of j: " + j);
    }
}
