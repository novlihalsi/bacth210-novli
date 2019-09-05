package com.xsis.day06;

public class Employee {
    private String name;
    private String ssn;
    private String emailAddress;
    private int yearOfBirth;
    private static int vocationDay=10;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() > 0) {
            this.name = name;
        }
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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }




    public Employee (String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public Employee (String name, String ssn, String emailAddress) {
        this.name = name;
        this.ssn = ssn;
        this.emailAddress = emailAddress;
    }

    void print(){
        System.out.println("Name : " + name);
        System.out.println("SSN : " +ssn);
        System.out.println("Email : " +emailAddress);
        System.out.println("YearOfBirth : " +yearOfBirth);
        System.out.println("Vocation Day : " +vocationDay);
        System.out.println();
    }
}
