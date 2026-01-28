package com.oops.emp.inheritance;


	class ContractEmployee extends Employee {
	    private int contractDurationMonths;

	    public ContractEmployee(int empId, String name, double salary, int duration) {
	        super(empId, name, salary);
	        this.contractDurationMonths = duration;
	    }

	    @Override
	    public void displayDetails() {
	        super.displayDetails();
	        System.out.println("Contract Duration: " + contractDurationMonths + " months");
	    }
	}

