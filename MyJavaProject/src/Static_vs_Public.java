public class Static_vs_Public {
    // Static method : Object toiri na korei call kora jay.
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method : Object toiri kore call korte hoy.
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {

        myStaticMethod();       // Call the static method
        // myPublicMethod(); This would compile an error

        Static_vs_Public myObj = new Static_vs_Public();    // Create an object of Main
        myObj.myPublicMethod();             // Call the public method on the object
    }
}
