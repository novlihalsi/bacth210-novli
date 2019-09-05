package com.xsis.day07.latihan;

public class Employee {
    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOFBirth;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public int getYearOFBirth() {
        return yearOFBirth;
    }

    public void setYearOFBirth(int yearOFBirth) {
        this.yearOFBirth = yearOFBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee (String name, String ssn, String emailAddress, int yearOFBirth, double salary) {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
        this.yearOFBirth = yearOFBirth;
        this.salary = salary;
    }



}
