class Teacher{
    String name;
    int age;
    int salary;

    void set_info(String n, int a, int s){
        name = n;
        age = a;
        salary = s;
    }

    void display_info(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("\n");
    }
}
public class OOP3{
    public static void main(String[] args) {
        
        Teacher t1 = new Teacher();
        t1.set_info("Abul", 30, 30000);
        t1.display_info();

        Teacher t2 = new Teacher();
        t2.set_info("Kalam", 25, 15000);
        t2.display_info();
    }
}