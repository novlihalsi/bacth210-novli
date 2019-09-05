package com.xsis.day07.inheritancedaniplement;

public class PegawaiDemo {
    public static void main(String[] args) {
        Pegawai e1 = new Pegawai("Ahmad Noveliansyah", "1111", "ahmadnovli@gmail.com", 1994, 500);
//        System.out.println(e1.toString());

        Manager e2 = new Manager("Ahmad Noveliansyah", "1111", "ahmadnovli@gmail.com", 1994, 500, 0.5);
//        System.out.println(e2.toString());

        PegawaiInterface em1 = new Manager("Ahmad Noveliansyah", "1111", "ahmadnovli@gmail.com", 1994, 500, 0.5);
//        em1.potongGaji(200);
//        em1.getInfoPegawai();

        PegawaiInterface p1 = new Programmer("Ahmad Noveliansyah", "1111", "ahmadnovli@gmail.com", 1994, 500,10);
        p1.hitungBonus();
        p1.getInfoPegawai();


    }
}
