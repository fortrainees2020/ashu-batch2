package useemployeemodule;

import com.employee.model.Employee;

public class UseEmployee {
	 public static void main(String[] args) {
	        Employee emp = new Employee(101, "Ashu");
	        emp.display();
	    }
}
/*
 Right click useemployee-module
→ Properties
→ Java Build Path
→ Projects tab
→ Add…
→ ✔ employee-module
→ Apply & Close
*/