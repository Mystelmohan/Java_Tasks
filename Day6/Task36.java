package Day6;

import java.util.ArrayList;
class Employee {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
public class Task36 {
    public static void main(String[] args) {
         ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 45));
        employees.add(new Employee("Alice", 55));
        employees.add(new Employee("Bob", 50));
        employees.add(new Employee("Carol", 60));

        ArrayList<Employee> employeesOver50 = new ArrayList<>();
        for (Employee emp : employees) {
            if (emp.getAge() > 50) {
                employeesOver50.add(emp);
            }
        }

        System.out.println("Employees over 50:");
        for (Employee emp : employeesOver50) {
            System.out.println(emp.getName()+" "+emp.getAge());
        }
    }
}
