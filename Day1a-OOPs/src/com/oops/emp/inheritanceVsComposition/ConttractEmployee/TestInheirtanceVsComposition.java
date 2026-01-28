package com.oops.emp.inheritanceVsComposition.ConttractEmployee;

public class TestInheirtanceVsComposition {
	public static void main(String[] args)
	{
		Employee contractEmp = new Employee(101, "Ravi", 40000, new Contract(12));
		Employee permanentEmp = new Employee(102, "Ashu", 60000, null);

		contractEmp.displayDetails();
		permanentEmp.displayDetails();

	}}
/*
 * 💡 No inheritance
💡 Behavior plugged dynamically
💡 No unused fields
*/
 