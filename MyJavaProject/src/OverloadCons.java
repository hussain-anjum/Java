class Box{
    double height;
    double width;
    double depth;

    Box(){
        height = 10;
        width = 10;
        depth = 10;
    }
    Box(double h, double w, double d){
        height = h;
        width = w;
        depth = d;
    }
    Box(double len){
        height = width = depth = len;
    }
    Box(Box ob){                            //passing object to constructor as parameter
        height = ob.height;
        width = ob.width;
        depth = ob.depth;
    }
    double volume(){
        return height * width * depth;
    }
}
public class OverloadCons{
    public static void main(String args[]) {
        double vol;
        Box mybox1 = new Box();
        Box mybox2 = new Box(3, 6, 9);
        Box mybox3 = new Box(10);
        Box mybox4 = new Box(mybox2);               //clone object of mybox2

        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);

        vol = mybox4.volume();
        System.out.println("Volume of mybox4 is " + vol);
    }
}