package com.oops.emp.inheritance;

public class TestEmployeeInheritance {
    public static void main(String[] args) {
        PermanentEmployee pe = new PermanentEmployee(101, "Ashu", 80000, 5000);
        ContractEmployee ce = new ContractEmployee(102, "Ravi", 40000, 12);

        System.out.println("Permanent Employee Details:");
        pe.displayDetails();

        System.out.println("\nContract Employee Details:");
        ce.displayDetails();
    }
}
