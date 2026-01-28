package com.functional.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UseEmployeeHashMap {
	 public static void main(String[] args) {
	 // Step 1: Create Employee List
    List<Employee> employeeList = new ArrayList<>();
    employeeList.add(new Employee(101, "Ravi", 50000));
    employeeList.add(new Employee(102, "Anita", 60000));
    employeeList.add(new Employee(103, "Suresh", 70000));
    employeeList.add(new Employee(104, "Meena", 45000));
    employeeList.add(new Employee(102, "Anita", 60000)); // duplicate in list allowed

    System.out.println("Employee List (Duplicates Allowed):");
    for (Employee e : employeeList) {
        System.out.println(e);
    }

    // Step 2: Create HashMap for Fast Lookup by ID
    Map<Integer, Employee> employeeMap = new HashMap<>();

    for (Employee e : employeeList) {
        employeeMap.put(e.getId(), e); // duplicate keys overwritten
    }

    System.out.println("\nEmployee HashMap (ID as Key, Unique):");
    for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
        System.out.println("Key: " + entry.getKey() + " | Value: " + entry.getValue());
    }

    // Step 3: Lookup Example
    int searchId = 103;
    
    if (employeeMap.containsKey(searchId)) {
        System.out.println("\nEmployee found with ID " + searchId + ": " + employeeMap.get(searchId));
    } else {
        System.out.println("\nEmployee not found with ID " + searchId);
    }	
    
    // Step 3: Fetch value based on key
    Scanner scanner = new Scanner(System.in);
    System.out.println("\nEnter Employee ID to fetch:");
     searchId = scanner.nextInt();

    if (employeeMap.containsKey(searchId)) {
        Employee emp = employeeMap.get(searchId); // fetch value by key
        System.out.println("Employee Found: " + emp);
    } else {
        System.out.println("Employee not found with ID: " + searchId);
    }

    scanner.close();
}
}
