package com.xsis.day07.abstrack;

public class Staff extends Employee {
    public Staff(String name, String ssn, String emailAddress, int yearOFBirth, double salary) {
        super(name, ssn, emailAddress, yearOFBirth, salary);
    }

    @Override
    public Double getTotalGaji() {
        return super.getSalary();
    }
}
