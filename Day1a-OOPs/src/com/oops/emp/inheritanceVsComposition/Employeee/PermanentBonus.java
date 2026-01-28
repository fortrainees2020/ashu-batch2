package com.oops.emp.inheritanceVsComposition.Employeee;

class PermanentBonus implements BonusPolicy {
    public double calculateBonus(double salary) {
        return salary * 0.20;
    }
}
