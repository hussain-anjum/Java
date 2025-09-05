class QueueDemo{
    int Q[] = new int[10];
    int rear,front;

    QueueDemo(int r, int f){
        rear = r;
        front = f;
    }
    void nqueue(int item){
        if(front == -1) front = 0;
        Q[++rear] = item;
        System.out.println("Inserted: "+item);
    }
    void dequeue(){
        int del_item = Q[front++];
        System.out.println("Deleted: "+del_item);
    }
    void display(){
        System.out.println("Queue elements: ");
        for(int i = front; i <= rear; i++){
            System.out.println(Q[i] + " ");
        }
        System.out.println();
    }
}
public class Queue {
    public static void main(String[] args) {
        QueueDemo q1 = new QueueDemo(-1, -1);
        q1.nqueue(10);
        q1.nqueue(20);
        q1.nqueue(30);
        q1.nqueue(40);
        q1.display();

        q1.dequeue();
        q1.dequeue();
        q1.display();
    }
}
