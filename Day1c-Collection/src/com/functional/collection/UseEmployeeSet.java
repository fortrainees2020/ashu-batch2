package com.functional.collection;

import java.util.HashSet;
import java.util.Set;

public class UseEmployeeSet {
	public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        employees.add(new Employee(101, "Ravi", 50000));
        employees.add(new Employee(102, "Anita", 60000));
        employees.add(new Employee(103, "Suresh", 70000));
        employees.add(new Employee(101, "Ravi", 50000)); // duplicate ignored

        System.out.println("Employee HashSet (No Duplicates):");

        for (Employee e : employees) {
            System.out.println(e);
        }
}
}
