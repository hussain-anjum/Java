class Vehicle{

    public void drive(){
        System.out.println("Vehicle is Moving");
    }
}
class Car extends Vehicle{
    
    @Override
    public void drive(){
        System.out.println("Car is Moving");
    }
    
    public void playMusic(){
        System.out.println("Car is Playing Music");
    }
}
public class Superclass_ref_SubclassObj {
    public static void main(String[] args) {
        Vehicle ob = new Vehicle();
        ob.drive();

        Car ob1 = new Car();
        ob1.drive();
        ob1.playMusic();

        Vehicle ob2 = new Car();    // Dynamic Method Dispatch
        ob2.drive();
        //ob2.playMusic();         // Error karon method overridding proyojon. Vehicle class e playMusic() method nai.
    }
}
