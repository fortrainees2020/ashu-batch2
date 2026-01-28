package com.oops.staticmember;


public class UseEmployee {

    public static void main(String[] args) {

        Employee e1 = new Employee("Ashu", 50000);
        Employee e2 = new Employee("Ravi", 60000);
        Employee e3 = new Employee("Neha", 55000);

        e1.display();
        System.out.println("--------------");
        e2.display();
        System.out.println("--------------");
        e3.display();
    }
}
