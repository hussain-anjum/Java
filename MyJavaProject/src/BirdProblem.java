import java.util.Scanner;

class Birds{
    int hands;
    int wings;

    Birds(int h, int w){
        hands = h;
        wings = w;
    }

    void display(){
        System.out.println("Birds has " + hands +" hands");
        System.out.println("Birds has " + wings +" two");
    }
}
class BirdsColor extends Birds{
    String color;

    BirdsColor(int h, int w, String c){
        super(h,w);
        color = c;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Birds color is "+ color);
    }
}
class BirdsMotion extends BirdsColor{
    boolean fly;

    BirdsMotion(int h, int w, String c, boolean f){
        super(h,w,c);
        fly = f;
    }

    @Override
    void display(){
        super.display();
        System.out.println("Birds can fly: "+fly);
    }
}
class BirdProblem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hands: ");
        int h = sc.nextInt();
        
        System.out.println("Wings: ");
        int w = sc.nextInt();
        sc.nextLine();

        System.out.println("Color: ");
        String c = sc.nextLine();

        BirdsMotion b = new BirdsMotion(h, w, c, true);

        b.display();
    }
    
}