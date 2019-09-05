package com.xsis.day07;

public class Manager extends Pegawai {
    private double commition;
    public Manager(String name, String ssn, String emailAddress, int yearOFBirth, double salary, double commition) {
        super(name, ssn, emailAddress, yearOFBirth, salary);
        this.commition = commition;
    }

    public double getCommition() {
        return commition;
    }

    public void setCommition(double commition) {
        this.commition = commition;
    }

    @Override
    public double getSalary() {
        Double totalCommition = this.commition*super.getSalary();
        return super.getSalary() + totalCommition;
    }

    @Override
    public String toString() {
        return super.toString()+", salary+commition=" +this.getSalary();
    }
}
