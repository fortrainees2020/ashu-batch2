package com.oops.emp.inheritanceVsComposition.ConttractEmployee;

public class Employee {

    protected int empId;
    protected String name;
    protected double salary;
    protected Contract contract; // Has - A COMPOSITION

    public Employee(int empId, String name, double salary, Contract contract) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.contract = contract;
    }

    public void displayDetails() {
        System.out.println("Employee ID   : " + empId);
        System.out.println("Employee Name : " + name);
        System.out.println("Base Salary   : $" + salary);

        if (contract != null) {
            System.out.println("Contract Duration: " +
                    contract.getDurationMonths() + " months");
        }
    }
}
