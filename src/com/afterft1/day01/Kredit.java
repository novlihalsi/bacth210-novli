package com.afterft1.day01;

import java.util.Scanner;

public class Kredit {
    public static void main(String[] args) {
        Kredit k1 = new Kredit();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Harga Mobil : ");
        double otr = scanner.nextDouble();
        System.out.println("Bunga : ");
        double bunga = scanner.nextDouble();
        System.out.println("Jangka Waktu : ");
        double tenor = scanner.nextDouble();

        k1.getJumlahBunga(otr, bunga, tenor);

    }

    void getJumlahBunga(double otr, double bunga, double tenorTahun){
        double bungaPersent = bunga/100;
        double uangMuka = 0.2 * otr;
        double plafonKredit = otr-uangMuka;
        double premi = (9.5/100) * otr;
        double biayaAdministrasi = 550000;


        double jumlahbunga = plafonKredit * (bungaPersent*tenorTahun);

        System.out.println("Bunga yang harus dibayar : " + (int)jumlahbunga);

        double angsuranPerbulan = (plafonKredit + jumlahbunga)/(tenorTahun*12);

        System.out.println("Angsuran Bulanan : " + (int)angsuranPerbulan);

        double bayarPertama = uangMuka + angsuranPerbulan + (premi/12) + biayaAdministrasi;

        System.out.println("Angsuran Bulan Pertama : " + (int)bayarPertama);

    }
}
