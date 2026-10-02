class Employee {
private String name;
private String address;
private double salary;
private String jobTitle;
Employee(String name, String address, double salary, String jobTitle) {
this.name = name;
this.address = address;
this.salary = salary;
this.jobTitle = jobTitle;
}
public String getName() {
return name;
}
public String getAddress() {
return address;
}
public double getSalary() {
return salary;
}
public String getJobTitle() {
return jobTitle;
}
public void setName(String name) {
this.name = name;
}
public void setAddress(String address) {
this.address = address;
}
public void setSalary(double salary) {
this.salary = salary;
}
public void setJobTitle(String jobTitle) {
this.jobTitle = jobTitle;
}
public void calculateBonus() {
System.out.println("Employee bonus: " + (salary * 0.10));
}
public void generatePerformanceReport() {
System.out.println("Performance report generated for " + name);
}
public void manageProject() {
System.out.println(name + " is managing a project.");
}
public void displayDetails() {
System.out.println("Name: " + name);
System.out.println("Address: " + address);
System.out.println("Salary: " + salary);
System.out.println("Job Title: " + jobTitle);
  }
}
class Manager extends Employee {
Manager(String name, String address, double salary) {
super(name, address, salary, "Manager");
}
public void calculateBonus() {
System.out.println("Manager Bonus: " + (getSalary() * 0.20));
}
public void manageProject() {
System.out.println(getName() + " is managing multiple projects.");
  }
}
class Developer extends Employee {
Developer(String name, String address, double salary) {
super(name, address, salary, "Developer");
}
public void calculateBonus() {
System.out.println("Developer Bonus: " + (getSalary() * 0.15));
}
public void manageProject() {
System.out.println(getName() + " is managing a software development project.");
  }
}
class Programmer extends Employee {
Programmer(String name, String address, double salary) {
super(name, address, salary, "Programmer");
}
public void calculateBonus() {
System.out.println("Programmer Bonus: " + (getSalary() * 0.10));
}
public void manageProject() {
System.out.println(getName() + " is managing a programming task.");
  }
}
public class Main {
public static void main(String[] args) {
Manager m1 = new Manager(
"Rahul",
"Pune",
80000);
Developer d1 = new Developer(
"Amit",
"Mumbai",
60000);
Programmer p1 = new Programmer(
"Rohit",
"Delhi",
50000);
System.out.println(" MANAGER ");
m1.displayDetails();
m1.calculateBonus();
m1.generatePerformanceReport();
m1.manageProject();
System.out.println("\n DEVELOPER ");
d1.displayDetails();
d1.calculateBonus();
d1.generatePerformanceReport();
d1.manageProject();
System.out.println("\n PROGRAMMER ");
p1.displayDetails();
p1.calculateBonus();
p1.generatePerformanceReport();
p1.manageProject();
  }
}