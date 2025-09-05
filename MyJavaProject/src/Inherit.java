class D{
    int a,b;

    void display1(){
        System.out.println("A: "+a+" and B: "+b);
    }
}

class B extends D{
    int c;
    
    void display2(){
        System.out.println("A: "+a+" and B: "+b+" and C: "+c);
    }
}

public class Inherit {
    public static void main(String[] args) {
        D ob = new D();
        ob.a = 10;
        ob.b = 20;
        ob.display1();

        B ob1 = new B();
        ob1.a = 30;
        ob1.b = 40;
        ob1.c = 50;
        ob1.display2();

    }
}
