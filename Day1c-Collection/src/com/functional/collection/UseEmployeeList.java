package com.functional.collection;

import java.util.ArrayList;
import java.util.List;

public class UseEmployeeList {
 public static void main(String[] args) {
    List<Employee> employees = new ArrayList<>();

    employees.add(new Employee(101, "Ravi", 50000));
    employees.add(new Employee(102, "Anita", 60000));
    employees.add(new Employee(103, "Suresh", 70000));
    employees.add(new Employee(101, "Ravi", 50000)); // duplicate

    System.out.println("Employee List (Allows Duplicates):");

    for (Employee e : employees) {
        System.out.println(e);
    }
}

}