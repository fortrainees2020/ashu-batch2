package com.list.collection;

import java.util.List;

class Employee {
    int id;
    String name;
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public String toString() {
        return id + " - " + name;
    }
}

public class EmployeeListDemo {

    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Ashu");
        Employee e2 = new Employee(2, "Ravi");

        // Immutable list
        List<Employee> employees = List.of(e1, e2);

        //employees.add(new Employee(3, "Neha"));

        System.out.println("Employees: " + employees);

        //  This will throw UnsupportedOperationException
        employees.add(new Employee(3, "Neha"));
    }
}