class Box{
    double height;
    double width;
    double depth;
}
public class TestBox1 {
    public static void main(String[] args) {
        double vol;
        Box mybox = new Box();

        mybox.height = 1;
        mybox.width = 2;
        mybox.depth = 3;

        vol = mybox.height*mybox.width*mybox.depth;

        System.out.println("Volume = "+vol);

    }
}
