package com.oops.emp.inheritance;

//Child class inheriting Employee
class PermanentEmployee extends Employee {
 private double bonus;

 public PermanentEmployee(int empId, String name, double salary, double bonus) {
     super(empId, name, salary); // Call parent constructor
     this.bonus = bonus;
 }

 @Override
 public void displayDetails() {
     super.displayDetails(); // Call parent method
     System.out.println("Bonus         : $" + bonus);
     System.out.println("Total Pay     : $" + (salary + bonus));
 }
}
