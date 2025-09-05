abstract class Car{
    
    abstract void drive();

    void playMusic(){
        System.out.println("Playing Music");
    }
}
class Audi extends Car{
    
    @Override
    void drive(){                                   // abstarct method ke ovveride korse
        System.out.println("Audi is driving");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Car ob = new Audi();                        // abstract class er object create kora jay na just reference variable create kora jay
        ob.drive();
        ob.playMusic();
    }
    
}
