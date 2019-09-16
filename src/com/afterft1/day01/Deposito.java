package com.afterft1.day01;

public class Deposito {
    public static void main(String[] args) {

        Deposito d1 = new Deposito();

        d1.hitungDeposito(10, 12500000,5);

    }

    void hitungDeposito(int tahun, double deposit_awal, double bunga){
        double bungaPersent = bunga/100;
        double deposit_akhir = deposit_awal;

        for (int i=1; i<=tahun; i++){
            double bungaPertahun = bungaPersent * deposit_akhir;
            deposit_akhir+=bungaPertahun;
            System.out.println("Total bunga per Tahun : " +i+" : " + (int)bungaPertahun + " saldo deposit : " + (int) deposit_akhir);
        }
        System.out.println();
        System.out.println("Total Deposito Selama " +tahun+" tahun : " +(int) (deposit_akhir));


    }
}
