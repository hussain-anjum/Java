class Person{                       //Super class/ Parent class
    String name;
    int age;

    void displayPerson(){
        System.out.println(name);
        System.out.println(age);
    }
}
class Teacher extends Person{                       //Teacher --> Sub class/child class
    //name--> Person class theke auto asbe.
    //age--> Person class theke auto asbe.
    int id;

    void displayTeacher(){
        displayPerson();            // name & age er jonno uporer method ekhane kaj korbe. name & age print kore dibe.
        System.out.println(id);
        System.out.println("\n"); 
    }
}
public class Inheritance {
    public static void main(String[] args) {         // Person class er sob variable niye amra Teacher class er jonno use korte parbo. 
        Teacher t1 = new Teacher();
        t1.name = "Kamal";
        t1.age = 50;
        t1.id = 254;

        t1.displayTeacher();
        
        Teacher t2 = new Teacher();
        t2.name = "Abul";
        t2.age = 55;
        t2.id = 214;

        t2.displayTeacher();
    }
}
