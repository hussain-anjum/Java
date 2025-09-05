// Student.java
class Student {
    private int studentId;
    private String name;
    private int age;
    private String grade;

    // Constructor to initialize student details
    public Student(int studentId, String name, int age, String grade) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }

    // Method to update the student's grade
    public void updateGrade(String newGrade) {
        grade = newGrade;
        System.out.println("Grade updated to: " + grade);
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        // Creating student objects
        Student student1 = new Student(101, "Alice", 20, "A");
        Student student2 = new Student(102, "Bob", 22, "B");

        // Displaying student details
        System.out.println("Student 1 Details:");
        student1.displayDetails();

        System.out.println("\nStudent 2 Details:");
        student2.displayDetails();

        // Updating grade for a student
        System.out.println("\nUpdating Student 1's grade...");
        student1.updateGrade("A+");

        // Displaying updated details
        System.out.println("\nUpdated Student 1 Details:");
        student1.displayDetails();
    }
}
