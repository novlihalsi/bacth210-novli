package com.xsis.day07.inheritancedaniplement;

public class Manager extends Pegawai implements PegawaiInterface {
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
    public String getInfoPegawai() {
        System.out.println("method call from object manager");
        System.out.println(toString());
        return null;
    }

    @Override
    public void potongGaji(double potongan) {
        super.setSalary(super.getSalary() - potongan);

    }

    @Override
    public void hitungBonus() {

    }

    @Override
    public double getSalary() {
        Double totalCommition = this.commition*super.getSalary();
        return super.getSalary() + totalCommition;
    }

    @Override
    public String toString() {
        return super.toString()+", commition="+this.getCommition()+", salary+commition=" +this.getSalary();
    }
}
