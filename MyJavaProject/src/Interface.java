interface Animal {
    
    public static final int age = 10;       // Interface er variable gula by default final.

    void eat();
    void sound();
}
class Dog implements Animal {
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    @Override
    public void sound() {
        System.out.println("Dog is barking");
    }
    void showage(){
        System.out.println("Dod age is: "+age);
    }
}
class Cat implements Animal {
    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }
    @Override
    public void sound() {
        System.out.println("Cat is meowing");
    }
}
public class Interface {
    public static void main(String[] args) {
        Dog ob = new Dog();
        ob.eat();
        ob.sound();
        //ob.age = 20; // Error karon age variable final. final variable er value change kora jay na.
        ob.showage();

        Cat ob1 = new Cat();
        ob1.eat(); 
        ob1.sound();
    }
}
