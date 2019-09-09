package com.xsis.day07.inheritancedaninterface;

public class Pegawai {
    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOFBirth;
    private double salary;


    public Pegawai (String name, String ssn, String emailAddress, int yearOFBirth, double salary) {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
        this.yearOFBirth = yearOFBirth;
        this.salary = salary;
    }

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

    @Override
    public String toString() {
        return "Pegawai{" +
                "name='" + name + '\'' +
                ", ssn='" + ssn + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", yearOFBirth=" + yearOFBirth +
                ", salary=" + salary +
                '}';
    }
}
