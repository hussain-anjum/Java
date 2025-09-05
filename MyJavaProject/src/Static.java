class A{
    static String school;
    String name;

    static void display(){
        //System.out.println("Name: "+name);      // Error: non-static variable name cannot be referenced from a static context
        System.out.println("School: "+school);
    }
    static {
        System.out.println("Static block");
    }
}
class Static {
    public static void main(String[] args) {
        A a = new A();
        a.name = "Rahul";
        
        A.school = "DPS";
        System.out.println(a.name);
        System.out.println(a.school);       // Static variable can be accessed using object reference

        A.display();
    }
}