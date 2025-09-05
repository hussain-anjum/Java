class A{
    int x = 10;

    A(){
        System.out.println("In A Constructor");
    }

    void show(){
        System.out.println("In A x = "+ x);
    }
    void letter(){
        System.out.println("A is a letter");
    }
}
class B extends A{
    int x = 50;         //superclass er Variable hide kore dilo.

    B(){
        super();                                    //super keyword use kore superclass er constructor call kora jay.
        System.out.println("In B Constructor");
    }

    @Override
    void show(){
        System.out.println("In B x = "+ x);
        System.out.println("In A x = "+ super.x);  //super keyword use kore superclass er variable access kora jay.
    }
    @Override
    void letter(){
        super.letter();                            //super keyword use kore superclass er method call kora jay.
        System.out.println("B is a letter");
    }

}
public class Super_keyword {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
        obj.letter();
    }
}
