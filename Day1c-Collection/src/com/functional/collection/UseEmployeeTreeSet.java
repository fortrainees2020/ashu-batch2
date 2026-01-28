package com.functional.collection;

import java.util.Set;
import java.util.TreeSet;

public class UseEmployeeTreeSet {
	 public static void main(String[] args) {

	        Set<Employee> employees = new TreeSet<>(
	            (e1, e2) -> Integer.compare(e1.getId(), e2.getId())
	        );

	        employees.add(new Employee(103, "Suresh", 70000));
	        employees.add(new Employee(101, "Ravi", 50000));
	        employees.add(new Employee(102, "Anita", 60000));
	        employees.add(new Employee(101, "Ravi", 50000)); // duplicate

	        System.out.println("Employee TreeSet (Sorted by ID):");

	        for (Employee e : employees) {
	            System.out.println(e);
	        }
}
}