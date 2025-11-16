import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee salary: ");
        int salary = sc.nextInt();
        Employee emp = new Employee(salary, name);
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        sc.close();
    }
}
class Employee {
    private int salary;
    private String name;
    public Employee(int salary, String name) {
        this.salary = salary;
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
