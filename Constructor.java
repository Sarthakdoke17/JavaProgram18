class Student {
    String name;

    //Default Constructor
    Student() {
        name = "Unknown";
    }

    // Parameterized Constructor
    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Student Name: " + name);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}