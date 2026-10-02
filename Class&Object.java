import java.util.Scanner;
class Student {
String name;
String city;
int age;
void addData() {
Scanner sc = new Scanner(System.in);
System.out.print("Enter name: ");
name = sc.nextLine();
System.out.print("Enter city: ");
city = sc.nextLine();
System.out.print("Enter age: ");
age = sc.nextInt();
}
void printData() {
System.out.println("Name: " + name);
System.out.println("City: " + city);
System.out.println("Age: " + age);
}
}
public class Main {
public static void main(String[] args) {
Student s1 = new Student();
Student s2 = new Student();
System.out.println("Enter details of Student 1:");
s1.addData();
System.out.println("\nEnter details of Student 2:");
s2.addData();
System.out.println("\nStudent 1 Details:");
s1.printData();
System.out.println("\nStudent 2 Details:");
s2.printData();
}
}