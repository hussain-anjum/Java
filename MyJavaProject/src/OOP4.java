class Teacher{
    String name;
    int age;
    int salary;

    Teacher(String n, int a, int s){          //Constructor --> parametarized
        name = n;
        age = a;
        salary = s;
    }

    Teacher(String n, int a){          
        name = n;
        age = a;
    }

    Teacher(){                              //Contructor --> default
        System.out.println("No value");
    }

    void display_info(){                        //method
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("\n");
    }
}
public class OOP4{
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher("Abul", 30, 30000);
        t1.display_info();

        Teacher t2 = new Teacher("Kalam", 25, 15000);
        t2.display_info();

        Teacher t3 = new Teacher("Hasem", 55);
        t3.display_info();

        Teacher t4 = new Teacher();
        t4.display_info();
    }
}