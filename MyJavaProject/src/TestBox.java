class Box{
    double h;
    double w;
    double d;
    
    Box(){
        h = 1;
        w = 2;
        d = 3;
    }

    double volume(){
        return h*w*d;
    }
}
public class TestBox {
    public static void main(String[] args) {
        double vol;
        Box mybox = new Box();
        vol = mybox.volume();

        System.out.println("Volume = "+vol);
    }
}
