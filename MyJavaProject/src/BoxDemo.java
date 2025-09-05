class Box {
    double width;
    double height;
    double depth;

    void setDim(double w, double h, double d){
        width = w;
        height = h;
        depth = d;
    }

    double vol(){
        return width*depth*height;
    }
}
public class BoxDemo {
    public static void main(String[] args) {

        Box mybox1 = new Box();
        Box mybox2 = new Box();

        mybox1.setDim(3, 1, 2);
        mybox2.setDim(4, 1, 3);

        System.out.println("Volume1 = "+mybox1.vol());
        System.out.println("Volume2 = "+mybox2.vol());

    }
}
