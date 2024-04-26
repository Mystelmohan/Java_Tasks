package Day6;

import java.util.ArrayList;

class Employees {
    private String name;
    private String country;

    public Employees(String name, String country) {
        this.name = name;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
}

public class Task37 {
    public static void main(String[] args) {
        ArrayList<Employees> employee = new ArrayList<>();
        employee.add(new Employees("John", "USA"));
        employee.add(new Employees("Alice", "UK"));
        employee.add(new Employees("Bob", "India"));
        employee.add(new Employees("Carol", "USA"));

        ArrayList<Employees> employeesFromUSA = new ArrayList<>();
        for (Employees emp : employee) {
            if (emp.getCountry().equals("USA")) {
                employeesFromUSA.add(emp);
            }
        }
        System.out.println("Employees from USA:");
        for (Employees emp : employeesFromUSA) {
            System.out.println(emp.getName()+" "+emp.getCountry());
        }
    }
}
