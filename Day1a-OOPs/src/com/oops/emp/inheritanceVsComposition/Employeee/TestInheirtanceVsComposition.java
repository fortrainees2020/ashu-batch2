package com.oops.emp.inheritanceVsComposition.Employeee;

public class TestInheirtanceVsComposition {
	public static void main(String[] args)
	{
		Employee permanentEmp = new Employee(101, "Ashu", 50000, new PermanentBonus());
		Employee contractEmp = new Employee(102, "Ravi", 40000, new NoBonus());
		permanentEmp.displayPay();
		contractEmp.displayPay();
		
		Employee SIemp =  new Employee();
		SIemp.setEmpId(1000);
		SIemp.setName("Kary");
		SIemp.setSalary(45000);
		SIemp.setBonusPolicy(new NoBonus()); // Setter Injection
	}}
/*
 * 💡 No inheritance
💡 Behavior plugged dynamically
💡 No unused fields
*/
 