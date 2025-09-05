class Box{
    double height;
    double width;
    double depth;

    Box(double height, double width, double depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    void displayVolume(){
        System.out.println(height*width*depth);
    }
}
public class BoxVolume {
    public static void main(String[] args) {
        Box mybox1 = new Box(10, 10, 10);
        Box mybox2 = new Box(20, 30, 10);

        mybox1.displayVolume();
        mybox2.displayVolume();
    }
}
