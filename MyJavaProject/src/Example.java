class Example {
    
    // Method to calculate the area of a triangle
    double area(int length, int width) {
        return 0.5 * length * width;
    }

    // Method to calculate the area of a circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a box
    double area(double height, double width, double depth) {
        return height * width * depth;
    }

    public static void main(String[] args) {
        Example obj = new Example();

        // Testing the area methods
        System.out.println("Triangle Area: " + obj.area(10, 5));
        System.out.println("Circle Area: " + obj.area(7.0));
        System.out.println("Box Area: " + obj.area(4.5, 3.2, 2.0));
    }
}
