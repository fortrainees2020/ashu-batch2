package collection.empmap;
import java.util.*;

public class EmployeeMap {
    public static void main(String[] args) {
    	   // Step 1: Create a map
        HashMap<Integer, List<Employee>> map = new HashMap<Integer, List<Employee>>();

        List<Employee> dept1 = new ArrayList<Employee>();
        dept1.add(new Employee(101, "Amit", 45000));
        dept1.add(new Employee(102, "Neha", 52000));

        List<Employee> dept2 = new ArrayList<Employee>();
        dept2.add(new Employee(103, "Raj", 61000));
        dept2.add(new Employee(104, "Simran", 47000));

        map.put(1, dept1);
        map.put(2, dept2);

        // Step 2: Combine all employees into one list
        List<Employee> allEmployees = new ArrayList<Employee>();
        for (List<Employee> list : map.values()) {
            allEmployees.addAll(list);
        }

        // Step 3: Apply Collections.max() with Comparator
        Employee maxEmp = Collections.max(allEmployees, new Comparator<Employee>() {
            public int compare(Employee e1, Employee e2) {
                if (e1.getSalary() > e2.getSalary()) return 1;
                else if (e1.getSalary() < e2.getSalary()) return -1;
                else return 0;
            }
        });

        // Step 4: Display result
        System.out.println("Employee with max salary: " + maxEmp);
        System.out.println("Max salary: " + maxEmp.getSalary());
    }
}
