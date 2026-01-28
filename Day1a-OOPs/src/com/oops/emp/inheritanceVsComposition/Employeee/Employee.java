package com.oops.emp.inheritanceVsComposition.Employeee;

//Parent class
public class Employee {

    private int empId;
    private String name;
    private double salary;
    private BonusPolicy bonusPolicy;

    public Employee() {}

	public Employee(int empId, String name, double salary, BonusPolicy bonusPolicy) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.bonusPolicy = bonusPolicy; // Dependency Injection via Constructor.
    }

    
    // Change - Calling the calculateBonus
    public void displayPay() {
        double bonus = bonusPolicy.calculateBonus(salary);
        System.out.println("Total Pay: " + (salary + bonus));
    }

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public BonusPolicy getBonusPolicy() {
		return bonusPolicy;
	}

	public void setBonusPolicy(BonusPolicy bonusPolicy) {
		this.bonusPolicy = bonusPolicy;
	}
    
    
}
