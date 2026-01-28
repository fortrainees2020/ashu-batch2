package com.oops.staticmember;


public class Employee {

    //  shared across all Employee objects
    private static int idCounter = 1000;

    private int empId;
    private String name;
    private double basicSalary;

    public Employee(String name, double basicSalary) {
        this.empId = generateId();   //  static method call
        this.name = name;
        this.basicSalary = basicSalary;
    }

    //  static method (class-level behavior)
    private static int generateId() {
        return ++idCounter;
    }

    public int getEmpId() {
        return empId;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void display() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Basic Salary  : " + basicSalary);
    }
}

