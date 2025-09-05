class Stack{
    int stck[] = new int[10];
    int top; 
    
    Stack(){
        top = -1;
    }
    void push(int item){
        if(top==9) System.out.println("Overflow");
        else stck[++top] = item;
    }
    void pop(){
        if(top == -1) System.out.println("Underflow");
        else top--;
    }
    void display(){
        for(int i=0; i<=top; i++){
            System.out.print(stck[i] + " " );
        }
    }
}
public class StackDemo {
    public static void main(String[] args) {
        Stack myStack1 = new Stack();
        //Stack myStack2 = new Stack();

        myStack1.push(1);
        myStack1.push(5);
        myStack1.push(7);
        myStack1.push(9);
        myStack1.push(3);
        System.out.print("After Push: ");
        myStack1.display();

        System.out.println("\n");
        
        myStack1.pop();
        myStack1.pop();
        System.out.print("After pop: ");
        myStack1.display();


    }
    
}
