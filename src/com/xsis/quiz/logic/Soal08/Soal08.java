package com.xsis.quiz.logic.Soal08;

public class Soal08 {
    public static void main(String[] args) {
        Soal08 s1 = new Soal08();

        Barang b1 = new Barang("Kopi", 1000);
        Barang b2 = new Barang("Gula", 1000);
        Barang b3 = new Barang("Indomie", 3000);



        s1.getTotalHarga(b1,b2,b3);


    }

    void getTotalHarga(Barang b1, Barang b2, Barang b3){
       int total = b1.harga + b2.harga +b3.harga;
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println("Total " + total );

    }
}
