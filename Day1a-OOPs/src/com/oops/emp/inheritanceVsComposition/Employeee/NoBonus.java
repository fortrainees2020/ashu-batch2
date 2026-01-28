package com.oops.emp.inheritanceVsComposition.Employeee;

class NoBonus implements BonusPolicy {
    public double calculateBonus(double salary) {
        return 0;
    }
}
