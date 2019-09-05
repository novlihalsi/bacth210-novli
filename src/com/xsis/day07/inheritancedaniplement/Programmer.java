package com.xsis.day07.inheritancedaniplement;

public class Programmer extends Pegawai implements PegawaiInterface {
    private double bonus;
    private int masaKerja;
    public Programmer(String name, String ssn, String emailAddress, int yearOFBirth, double salary, int masaKerja) {
        super(name, ssn, emailAddress, yearOFBirth, salary);
        this.masaKerja = masaKerja;

    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public int getMasaKerja() {
        return masaKerja;
    }

    public void setMasaKerja(int masaKerja) {
        this.masaKerja = masaKerja;
    }

    @Override
    public String getInfoPegawai() {
        System.out.println(toString());
        return null;
    }

    @Override
    public void potongGaji(double potongan) {

    }

    @Override
    public void hitungBonus() {
        if(getMasaKerja()>10){
            setBonus(5 * super.getSalary());
        } else {
            setBonus(2 * super.getSalary());
        }

    }

    @Override
    public double getSalary() {
        return super.getSalary()+bonus;
    }

    @Override
    public String toString() {
        return super.toString()+", Bonus="+this.getBonus()+", Masa Kerja="+this.getMasaKerja()+"th"+", Total Salary="+this.getSalary();
    }
}
