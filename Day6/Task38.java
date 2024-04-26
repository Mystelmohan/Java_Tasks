package Day6;

import java.util.ArrayList;
class Employeedetails {
    private String name;
    private String country;
    private int age;

    public Employeedetails(String name, int age,String country) {
        this.name = name;
        this.country = country;
        this.age=age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getCountry() {
        return country;
    }
}
public class Task38 {
    public static void main(String[] args) {
        ArrayList<Employeedetails> employee = new ArrayList<>();
        employee.add(new Employeedetails("John", 20,"USA"));
        employee.add(new Employeedetails("Alice",35, "UK"));
        employee.add(new Employeedetails("Bob",25, "India"));
        employee.add(new Employeedetails("Carol",30, "USA"));
        for(Employeedetails emp:employee){
            System.out.println(emp.getName()+" "+emp.getAge()+" "+emp.getCountry());
        }
    }
}
