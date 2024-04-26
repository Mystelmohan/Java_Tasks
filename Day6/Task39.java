package Day6;

import java.util.HashMap;
import java.util.Map;
class EmpMembers {
    private int id;
    private String name;
    
    public EmpMembers(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return "Employee ID: " + id + ", Name: " + name;
    }
}

public class Task39 {
    public static void main(String[] args) {
        Map<Integer, EmpMembers> empMembersMap = new HashMap<>();

        empMembersMap.put(100, new EmpMembers(100, "John"));
        empMembersMap.put(200, new EmpMembers(200, "Alice"));
        empMembersMap.put(300, new EmpMembers(300, "Bob"));
        empMembersMap.put(400, new EmpMembers(400, "Emily"));

        int targetId = 300;
        EmpMembers targetEmpMember = empMembersMap.get(targetId);
        if (targetEmpMember != null) {
            System.out.println("Employee with ID " + targetId + ": " + targetEmpMember);
        } else {
            System.out.println("Employee with ID " + targetId + " not found.");
        }

        System.out.println("\nAll employee members:");
        for (Map.Entry<Integer, EmpMembers> entry : empMembersMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("\nEmployee Members Map:");
        System.out.println(empMembersMap);
    }
}
