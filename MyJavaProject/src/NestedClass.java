class NestedClass {
    static class A {
        public void display() {
            System.out.println("Inside static nested class");
        }
    }

    class B {
        public void display() {
            System.out.println("Inside non-static inner class");
        }
    }

    public static void main(String[] args) {
        // Creating instance of static nested class
        NestedClass.A ob1 = new NestedClass.A();
        ob1.display();

        // Creating instance of non-static inner class
        NestedClass ob2 = new NestedClass();
        NestedClass.B ob3 = ob2.new B();
        ob3.display();
    }
}
