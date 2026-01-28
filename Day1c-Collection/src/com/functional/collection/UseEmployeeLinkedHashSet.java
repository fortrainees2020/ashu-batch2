package com.functional.collection;

import java.util.LinkedHashSet;
import java.util.Set;

public class UseEmployeeLinkedHashSet {

    public static void main(String[] args) {

        Set<Employee> employees = new LinkedHashSet<>();

        employees.add(new Employee(101, "Ravi", 50000));
        employees.add(new Employee(102, "Anita", 60000));
        employees.add(new Employee(103, "Suresh", 70000));
        employees.add(new Employee(101, "Ravi", 50000)); // duplicate

        System.out.println("Employee LinkedHashSet (Insertion Order):");

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
