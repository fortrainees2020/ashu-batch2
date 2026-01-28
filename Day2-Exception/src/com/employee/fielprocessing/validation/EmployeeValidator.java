package com.employee.fielprocessing.validation;

public class EmployeeValidator {

    public static void validate(String id, String name, String salary)
            throws ValidationException {

        if (!id.matches("\\d+")) {
            throw new ValidationException("Invalid ID");
        }

        if (name == null || name.trim().isEmpty()) {
            throw new ValidationException("Name cannot be empty");
        }

        double sal = Double.parseDouble(salary);
        if (sal <= 0) {
            throw new ValidationException("Salary must be positive");
        }
    }
}
