class Teacher{
    String name;
    int age;
    int salary;

    void display_info(){                            //method
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
        System.out.println("\n");
    }
}
public class OOP2{
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

        t1.name = "Abul";
        t1.age = 55;
        t1.salary = 30000;

        t1.display_info();

        Teacher t2 = new Teacher();

        t2.name = "Kalam";
        t2.age = 60;
        t2.salary = 25000;

        t2.display_info();
    }
}